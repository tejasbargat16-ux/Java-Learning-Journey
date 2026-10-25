# ☕ Day 02 — Input & Operators

## 🎯 Concept
The `Scanner` class reads input from the user (keyboard). Operators let us calculate with that input.

## 🧠 Key Points
- Import first: `import java.util.Scanner;`
- Create it once: `Scanner scanner = new Scanner(System.in);`
- Methods: `nextInt()`, `nextDouble()`, `next()` (one word), `nextLine()` (full line).
- Operator groups: arithmetic (`+ - * / %`), relational (`> < >= <= == !=`), logical (`&& || !`), assignment (`= += -=`), increment/decrement (`++ --`).
- Precedence: `*`, `/`, `%` run before `+`, `-`. Use brackets to be clear.
- Close the scanner when finished: `scanner.close();`

## 💻 Code Example
```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = scanner.nextLine();

System.out.print("Enter your age: ");
int age = scanner.nextInt();
```
*(from `UserInput.java`)*

## ⚠️ Common Mistakes
- **`nextLine()` after `nextInt()` gets skipped**, because `nextInt()` leaves the Enter key in the buffer. Fix: add an extra `scanner.nextLine();` after `nextInt()`.
- Forgetting the `import`.
- Average of ints: `(a + b) / 2` loses decimals. Use `(a + b) / 2.0`.
- `a = b` (assign) instead of `a == b` (compare).

## ❓ Interview Questions
- **Q: Difference between `i++` and `++i`?**
  A: `i++` uses the value first then increments; `++i` increments first then uses it.
- **Q: `next()` vs `nextLine()`?**
  A: `next()` reads one word (stops at space); `nextLine()` reads the whole line.
- **Q: `Scanner` vs `BufferedReader`?**
  A: Scanner is easier and parses types; BufferedReader is faster for large input.
- **Q: What does `%` give?**
  A: The remainder (`10 % 3 = 1`).

## 🔗 Practice Code
[📁 Day-02-Input-Operators](../Day-02-Input-Operators)
