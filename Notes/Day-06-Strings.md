# ☕ Day 06 — Strings

## 🎯 Concept
A `String` is a sequence of characters. In Java, Strings are **immutable objects**: once created, they cannot be changed.

## 🧠 Key Points
- Useful methods: `length()`, `charAt(i)`, `toUpperCase()`, `toLowerCase()`, `equals()`, `equalsIgnoreCase()`, `indexOf()`, `contains()`, `substring()`, `trim()`, `split()`.
- Methods return a **new** String; the original is unchanged.
- String literals live in the **String Pool** (`"hi"` twice → same object).
- Typical problems: reverse, palindrome, count vowels/words, remove spaces, character frequency.
- Many concatenations in a loop are slow. Use `StringBuilder`.

## 💻 Code Example
```java
String reverse = "";

for (int i = word.length() - 1; i >= 0; i--) {
    reverse = reverse + word.charAt(i);
}

if (word.equalsIgnoreCase(reverse)) {
    System.out.println("Palindrome.");
}
```
*(from `Palindrome.java`)*

## ⚠️ Common Mistakes
- Using `==` to compare Strings.
- `s.toUpperCase();` alone does nothing. You must store it: `s = s.toUpperCase();`.
- `StringIndexOutOfBoundsException` when `charAt(i)` goes past `length() - 1`.
- Counting words with `split(" ")` breaks on multiple spaces. Use `split("\\s+")`.

## ❓ Interview Questions
- **Q: Why are Strings immutable?**
  A: Security, thread-safety, String Pool sharing, and safe use as HashMap keys.
- **Q: `String` vs `StringBuilder` vs `StringBuffer`?**
  A: `String` is immutable; `StringBuilder` is mutable and fast; `StringBuffer` is mutable and thread-safe (slower).
- **Q: `new String("a") == "a"`?**
  A: `false`. `new` creates a separate object outside the pool.
- **Q: What is the String Pool?**
  A: A memory area that reuses identical String literals.

## 🔗 Practice Code
[📁 Day-06-Strings](../Day-06-Strings)
