# ☕ Day 01 — Basics

## 🎯 Concept
A Java program is a **class** with a `main` method. Execution always starts at `main`. Data is stored in **variables**, and every variable has a **data type**.

## 🧠 Key Points
- File name must match the `public class` name (`HelloWorld.java` → `class HelloWorld`).
- Entry point: `public static void main(String[] args)`.
- Primitive types: `int`, `double`, `char`, `boolean`. `String` is a class (reference type), not a primitive.
- `System.out.println()` prints with a new line, `System.out.print()` does not.
- Arithmetic operators: `+ - * / %`. Integer division drops the decimal (`7 / 2 = 3`).
- `+` with a `String` means **concatenation** (`"Age: " + 20`).
- Java is **case-sensitive** (`System` ≠ `system`).

## 💻 Code Example
```java
String name = "Tejas";
int age = 20;
double height = 5.8;
char grade = 'A';
boolean isStudent = true;

System.out.println("Name: " + name);
```
*(from `Variables.java`)*

## ⚠️ Common Mistakes
- Class name and file name do not match.
- Missing `;` at the end of a statement.
- Using double quotes for `char` (`"A"` is a String, `'A'` is a char).
- Expecting `7 / 2` to give `3.5` (use `7 / 2.0`).
- Writing `system.out.println` in lowercase.

## ❓ Interview Questions
- **Q: Difference between JDK, JRE and JVM?**
  A: JVM runs bytecode, JRE = JVM + libraries, JDK = JRE + development tools (`javac`, etc.).
- **Q: Why is `main` static?**
  A: The JVM must call it without creating an object of the class.
- **Q: Is Java platform independent?**
  A: Yes. Source → bytecode (`.class`) → runs on any OS that has a JVM.
- **Q: Primitive vs `String`?**
  A: Primitives store values directly; `String` is an object stored on the heap.

## 🔗 Practice Code
[📁 Day-01-Basics](../Day-01-Basics)
