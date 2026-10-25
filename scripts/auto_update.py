#!/usr/bin/env python3
"""
Auto-update script for Java-Learning-Journey.

1. Creates Notes/<Day-folder>.md for every Day-* folder that has no note yet
   - with ANTHROPIC_API_KEY set  -> full notes written by Claude
   - without a key               -> template notes built from your code + README
2. Updates README.md automatically:
   - progress badge + "Completed: Day N"
   - new row in the "Topics Covered" table
   - Notes table      (<!-- NOTES:START --> ... <!-- NOTES:END -->)
   - Folder structure (<!-- STRUCTURE:START --> ... <!-- STRUCTURE:END -->)

Existing notes are NEVER overwritten (so your own edits are safe).
Use FORCE_NOTES=1 to regenerate everything.
"""
import json
import os
import re
import sys
import urllib.request
from urllib.parse import quote

ROOT = os.getcwd()
NOTES_DIR = "Notes"
SKIP_DIRS = {".git", ".github", "node_modules", "out", "bin", "__pycache__"}
SKIP_EXT = (".class",)
ICONS = {".java": "☕", ".md": "📝", ".png": "🖼️", ".jpg": "🖼️", ".jpeg": "🖼️",
         ".yml": "⚙️", ".yaml": "⚙️", ".py": "🐍"}
MODEL = os.environ.get("ANTHROPIC_MODEL", "claude-sonnet-5-5")
API_KEY = os.environ.get("ANTHROPIC_API_KEY", "").strip()
FORCE = os.environ.get("FORCE_NOTES", "").strip() in ("1", "true", "True")
TOTAL_DAYS = 60

DAY_RE = re.compile(r"^Day-(\d+)[-—–]?(.*)$")


# ----------------------------------------------------------------- helpers
def read(path):
    with open(path, encoding="utf-8", errors="replace") as f:
        return f.read()


def write(path, text):
    os.makedirs(os.path.dirname(path) or ".", exist_ok=True)
    with open(path, "w", encoding="utf-8", newline="\n") as f:
        f.write(text)


def day_folders():
    out = []
    for d in os.listdir(ROOT):
        m = DAY_RE.match(d)
        if m and os.path.isdir(d):
            out.append((int(m.group(1)), d, m.group(2).strip("-—– ").replace("-", " ")))
    return sorted(out)


def java_files(folder):
    return sorted(f for f in os.listdir(folder) if f.endswith(".java"))


def icon(name):
    return ICONS.get(os.path.splitext(name)[1].lower(), "📄")


def pretty_title(num, topic):
    return f"Day {num:02d} — {topic}"


def note_path(folder):
    return os.path.join(NOTES_DIR, folder + ".md")


# --------------------------------------------------------- README parsing
def readme_topics(folder):
    """Bullets under 'Topics Covered' in the day's README."""
    p = os.path.join(folder, "README.md")
    if not os.path.exists(p):
        return []
    lines = read(p).splitlines()
    topics, on = [], False
    for ln in lines:
        s = ln.strip()
        if not on:
            if "topics covered" in s.lower():
                on = True
            continue
        if s.startswith("- "):
            topics.append(s[2:].replace('"', "").replace("`", "").strip())
        elif s and topics:
            break
    return topics


def readme_descriptions(folder):
    """filename -> description, from 'File| Description' style lines."""
    p = os.path.join(folder, "README.md")
    desc = {}
    if not os.path.exists(p):
        return desc
    for ln in read(p).splitlines():
        if "|" in ln and ".java" in ln:
            a, _, b = ln.partition("|")
            name = a.strip().strip('"`* ')
            desc[name] = b.strip().strip("| ").replace('"', "`") if b.strip() else ""
    return desc


# ------------------------------------------------------ fallback (no API)
KEYWORDS = [
    (r"\bScanner\b", "Takes user input with `Scanner`"),
    (r"\bif\s*\(", "Uses `if` / `else` decisions"),
    (r"\bswitch\s*\(", "Uses `switch`"),
    (r"\bfor\s*\(", "Uses `for` loops"),
    (r"\bwhile\s*\(", "Uses `while` / `do-while` loops"),
    (r"\w+\[\]", "Uses arrays"),
    (r"\bStringBuilder\b", "Uses `StringBuilder`"),
    (r"\bclass\s+\w+", "Defines classes"),
    (r"\bnew\s+\w+\(", "Creates objects with `new`"),
    (r"\bthis\.", "Uses the `this` keyword"),
    (r"\bprivate\b", "Uses `private` (encapsulation)"),
    (r"\bextends\b", "Uses inheritance (`extends`)"),
    (r"\bsuper\b", "Uses `super`"),
    (r"@Override", "Overrides methods (`@Override`)"),
    (r"\babstract\b", "Uses `abstract`"),
    (r"\binterface\b", "Defines an `interface`"),
    (r"\bimplements\b", "Implements interfaces"),
    (r"\btry\s*\{", "Uses `try` / `catch` (exceptions)"),
    (r"\bthrow[s]?\b", "Uses `throw` / `throws`"),
    (r"\bArrayList\b", "Uses `ArrayList`"),
    (r"\bHashMap\b", "Uses `HashMap`"),
    (r"\bHashSet\b", "Uses `HashSet`"),
    (r"<\w+>", "Uses generics"),
    (r"\bThread\b", "Uses threads"),
    (r"\bFile(Reader|Writer|InputStream|OutputStream)?\b", "Works with files"),
    (r"\bstatic\b", "Uses `static`"),
    (r"\bfinal\b", "Uses `final`"),
]


def pick_example(folder, files):
    best, best_score = None, -1
    for f in files:
        text = read(os.path.join(folder, f))
        n = len(text.splitlines())
        score = 0
        if "Demo" in f or f in ("Main.java",):
            score += 3
        if 8 <= n <= 40:
            score += 2
        if "main(" in text:
            score += 1
        if score > best_score:
            best, best_score = f, score
    if not best:
        return None, ""
    lines = read(os.path.join(folder, best)).splitlines()[:40]
    return best, "\n".join(lines)


def fallback_note(num, folder, topic):
    files = java_files(folder)
    topics = readme_topics(folder)
    desc = readme_descriptions(folder)
    code_all = "\n".join(read(os.path.join(folder, f)) for f in files)
    spotted = [label for pat, label in KEYWORDS if re.search(pat, code_all)]
    ex_name, ex_code = pick_example(folder, files)

    out = [f"# ☕ {pretty_title(num, topic)}", "", "## 🎯 Concept",
           f"> ✍️ Write 2-3 lines in your own words about **{topic}**.", "",
           "## 🧠 Key Points"]
    if topics:
        out += [f"- {t}" for t in topics]
    else:
        out += ["- ✍️ Add your key points here."]
    if spotted:
        out += ["", "**Spotted in your code:** " + " · ".join(spotted[:8])]
    out += ["", "## 💻 Code Example"]
    if ex_name:
        out += ["```java", ex_code, "```", f"*(from `{ex_name}`)*"]
    else:
        out += ["✍️ Paste your best snippet here."]
    if files:
        out += ["", "## 🧪 Programs Written", "| File | What it does |", "|---|---|"]
        for f in files:
            out.append(f"| `{f}` | {desc.get(f, '')} |")
    out += ["", "## ⚠️ Common Mistakes", "- ✍️ What errors did you hit today?", "",
            "## ❓ Interview Questions", "- **Q:** ✍️ ...", "  **A:** ...", ""]
    out += footer(folder, auto="template")
    return re.sub(r"\n{3,}", "\n\n", "\n".join(out))


# --------------------------------------------------------------- Claude API
PROMPT = """You are a friendly Java tutor. Write study notes for a beginner (2nd-year B.Tech student) \
for the topic below, based ONLY on the student's own README and code.

Use EXACTLY this markdown structure, in simple English, no text before or after:

# ☕ {title}

## 🎯 Concept
(2-4 lines, simple definition)

## 🧠 Key Points
(6-9 bullets; tables allowed if it helps)

## 💻 Code Example
(one short snippet, max 25 lines, taken from the student's code, in a ```java block, then a line *(from `FileName.java`)*)

## ⚠️ Common Mistakes
(4-5 bullets)

## ❓ Interview Questions
(4 items in this format)
- **Q: question?**
  A: short answer.

Rules: be accurate, concise, beginner friendly. Do not invent files that are not in the code."""


def call_claude(title, folder):
    parts = [f"TOPIC: {title}", f"FOLDER: {folder}"]
    p = os.path.join(folder, "README.md")
    if os.path.exists(p):
        parts.append("README:\n" + read(p)[:5000])
    budget = 22000
    for f in java_files(folder):
        code = read(os.path.join(folder, f))[:2500]
        if budget - len(code) < 0:
            break
        budget -= len(code)
        parts.append(f"FILE {f}:\n{code}")
    body = json.dumps({
        "model": MODEL,
        "max_tokens": 3000,
        "system": PROMPT.format(title=title),
        "messages": [{"role": "user", "content": "\n\n".join(parts)}],
    }).encode("utf-8")
    req = urllib.request.Request(
        "https://api.anthropic.com/v1/messages", data=body, method="POST",
        headers={"content-type": "application/json", "x-api-key": API_KEY,
                 "anthropic-version": "2023-06-01"})
    with urllib.request.urlopen(req, timeout=120) as r:
        data = json.loads(r.read().decode("utf-8"))
    text = "".join(b.get("text", "") for b in data.get("content", []) if b.get("type") == "text").strip()
    text = re.sub(r"^```(?:markdown|md)?\s*\n", "", text)
    text = re.sub(r"\n```\s*$", "", text)
    if not text.startswith("#"):
        raise ValueError("unexpected response")
    return text


def footer(folder, auto):
    label = "🤖 Auto-generated by Claude" if auto == "claude" else "🤖 Auto-generated template: fill the ✍️ parts yourself"
    return ["", "## 🔗 Practice Code", f"[📁 {folder}](../{quote(folder)})", "", "---", f"*{label}*", ""]


def make_note(num, folder, topic):
    title = pretty_title(num, topic)
    if API_KEY:
        try:
            text = call_claude(title, folder)
            return text.rstrip() + "\n" + "\n".join(footer(folder, "claude"))
        except Exception as e:  # network / quota / parse problems
            print(f"  ! Claude API failed for {folder}: {e}. Using template.", file=sys.stderr)
    return fallback_note(num, folder, topic)


# -------------------------------------------------------------- README edits
def replace_block(text, start, end, body, before_heading=None):
    block = f"{start}\n{body}\n{end}"
    if start in text and end in text:
        return re.sub(re.escape(start) + r".*?" + re.escape(end), lambda m: block, text, flags=re.S)
    section = block
    if before_heading and before_heading in text:
        return text.replace(before_heading, section + "\n\n---\n\n" + before_heading, 1)
    return text.rstrip() + "\n\n" + section + "\n"


def notes_table(days):
    rows = ["| Day | Topic | Notes |", "|:---:|:---|:---|"]
    for num, folder, topic in days:
        if os.path.exists(note_path(folder)):
            rows.append(f"| **{num:02d}** | {topic} | [📓 Open notes]({NOTES_DIR}/{quote(folder)}.md) |")
    return "\n".join(rows)


def list_files(folder):
    out = []
    for root, dirs, files in os.walk(folder):
        dirs[:] = sorted(d for d in dirs if d not in SKIP_DIRS and not d.startswith("."))
        for f in sorted(files):
            if f.endswith(SKIP_EXT) or f.startswith("."):
                continue
            out.append(os.path.relpath(os.path.join(root, f), ".").replace(os.sep, "/"))
    return out


def structure_body():
    dirs = sorted(d for d in os.listdir(ROOT)
                  if os.path.isdir(d) and d not in SKIP_DIRS and not d.startswith("."))
    root_files = sorted(f for f in os.listdir(ROOT)
                        if os.path.isfile(f) and not f.startswith(".") and not f.endswith(SKIP_EXT))
    lines, total = [], 0
    for d in dirs:
        files = list_files(d)
        total += len(files)
        lines += ["<details>", f"<summary>📁 <b>{d}</b> — {len(files)} files</summary>", ""]
        lines += [f"- {icon(p)} [{p[len(d) + 1:]}]({quote(p)})" for p in files]
        lines += ["", "</details>", ""]
    if root_files:
        total += len(root_files)
        lines += ["<details>", f"<summary>📁 <b>Root files</b> — {len(root_files)} files</summary>", ""]
        lines += [f"- {icon(f)} [{f}]({quote(f)})" for f in root_files]
        lines += ["", "</details>", ""]
    head = f"**{len(dirs)} folders · {total} files** — tap a folder to expand 👇"
    return head + "\n\n" + "\n".join(lines).rstrip()


def update_progress(text, latest):
    text = re.sub(r"Progress-Day%20\d+%20of%20\d+", f"Progress-Day%20{latest}%20of%20{TOTAL_DAYS}", text)
    text = re.sub(r"(\*\*Completed:\*\*\s*)Day \d+ of \d+ days", rf"\g<1>Day {latest} of {TOTAL_DAYS} days", text)
    return text


def add_topic_row(text, num, folder, topic):
    if re.search(rf"\|\s*\*\*{num:02d}\*\*\s*\|", text):
        return text
    topics = readme_topics(folder)
    highlights = ", ".join(topics[:4]) if topics else "—"
    row = f"| **{num:02d}** | [{topic}]({quote(folder)}) | {highlights} | ✅ Completed |"
    rows = list(re.finditer(r"^\| \*\*\d+\*\*.*$", text, flags=re.M))
    if not rows:
        return text
    last = rows[-1]
    return text[:last.end()] + "\n" + row + text[last.end():]


def update_readme(days):
    if not os.path.exists("README.md"):
        write("README.md", "# Java Learning Journey\n")
    text = read("README.md")
    if days:
        latest = days[-1][0]
        text = update_progress(text, latest)
        for num, folder, topic in days:
            text = add_topic_row(text, num, folder, topic)
    heading = "## 🗂️ Repository Structure"
    text = replace_block(text, "<!-- NOTES:START -->", "<!-- NOTES:END -->", notes_table(days),
                         before_heading=None)
    if "## 📓 Notes" not in text:
        # first time: give the notes block its own heading, just above the structure section
        text = text.replace("<!-- NOTES:START -->", "## 📓 Notes\n\n> Short revision notes for every day, in the `Notes/` folder.\n\n<!-- NOTES:START -->", 1)
        if heading in text and text.index("<!-- NOTES:END -->") > text.index(heading):
            blk = re.search(r"## 📓 Notes.*?<!-- NOTES:END -->", text, flags=re.S).group(0)
            text = text.replace(blk, "", 1)
            text = text.replace(heading, blk + "\n\n---\n\n" + heading, 1)
    if "<!-- STRUCTURE:START -->" not in text:
        text = text.rstrip() + "\n\n" + heading + "\n\n<!-- STRUCTURE:START -->\n<!-- STRUCTURE:END -->\n"
    text = replace_block(text, "<!-- STRUCTURE:START -->", "<!-- STRUCTURE:END -->", structure_body())
    write("README.md", text)


# --------------------------------------------------------------------- main
def main():
    days = day_folders()
    mode = "Claude API" if API_KEY else "template (no ANTHROPIC_API_KEY)"
    print(f"Notes mode: {mode}")
    created = 0
    for num, folder, topic in days:
        if not java_files(folder) and not os.path.exists(os.path.join(folder, "README.md")):
            continue
        if os.path.exists(note_path(folder)) and not FORCE:
            continue
        print(f"  + writing {note_path(folder)}")
        write(note_path(folder), make_note(num, folder, topic))
        created += 1
    update_readme(days)
    print(f"Done. {created} new note(s).")


if __name__ == "__main__":
    main()
