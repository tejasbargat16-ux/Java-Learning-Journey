# ☕ Day 03 — Conditional Statements

## 🎯 Concept
Conditionals let a program **make decisions**: run a block only if a condition is `true`.

## 🧠 Key Points
- `if`, `if-else`, `else if` ladder, nested `if`, and `switch`.
- A condition must be a `boolean` expression.
- Logical operators: `&&` (AND), `||` (OR), `!` (NOT).
- **Short-circuit:** in `a && b`, if `a` is false, `b` is not checked.
- Compare Strings with `.equals()`, never `==`.
- In an `else if` ladder, only the **first** true branch runs, so order matters.

## 💻 Code Example
```java
if (percentage >= 90) {
    System.out.println("Grade: A");
} else if (percentage >= 80) {
    System.out.println("Grade: B");
} else if (percentage >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```
*(from `GradeCalculator.java`)*

## ⚠️ Common Mistakes
- `if (x = 5)` instead of `if (x == 5)`.
- `if (name == "admin")` instead of `name.equals("admin")`.
- Putting `;` right after `if (...)`, which ends the `if` early.
- Wrong order in the ladder (checking `>= 60` before `>= 90`).
- Skipping braces `{}` and then adding a second line that is not part of the `if`.

## ❓ Interview Questions
- **Q: `==` vs `.equals()`?**
  A: `==` compares references (memory addresses); `.equals()` compares content.
- **Q: What is short-circuiting?**
  A: `&&` and `||` skip the right side when the result is already known.
- **Q: `switch` vs `if-else`?**
  A: `switch` is cleaner for many fixed values; `if-else` handles ranges and complex conditions.
- **Q: What is the ternary operator?**
  A: `condition ? valueIfTrue : valueIfFalse`.

## 🔗 Practice Code
[📁 Day-03-Conditional-Statements](../Day-03-Conditional-Statements)
