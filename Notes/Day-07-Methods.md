# ☕ Day 07 — Methods

## 🎯 Concept
A method is a **reusable block of code** with a name. It helps us split big problems into small parts.

## 🧠 Key Points
- Syntax: `returnType name(parameters) { ... }`
- `void` = returns nothing; otherwise use `return value;`.
- **Parameters** are in the definition; **arguments** are the values you pass.
- `static` methods can be called from `main` without creating an object.
- **Method overloading:** same name, different parameter list (number, type or order).
- Java is always **pass-by-value**. For objects/arrays, the reference is copied, so changes to the content are visible outside.

## 💻 Code Example
```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}

static double add(double a, double b) {
    return a + b;
}
```
*(from `MethodOverloading.java`)*

## ⚠️ Common Mistakes
- Missing `return` in a non-void method.
- Calling a non-static method directly from `static main`.
- Trying to overload by changing **only the return type** (not allowed).
- Expecting a primitive changed inside a method to change outside.

## ❓ Interview Questions
- **Q: Overloading vs overriding?**
  A: Overloading = same class, different parameters (compile time). Overriding = child class redefines parent's method (runtime).
- **Q: Is Java pass-by-value or pass-by-reference?**
  A: Always pass-by-value (object references are passed by value).
- **Q: Can we overload `main`?**
  A: Yes, but the JVM only starts from `main(String[] args)`.
- **Q: Why use methods?**
  A: Reusability, readability, easier testing and debugging.

## 🔗 Practice Code
[📁 Day-07-Methods](../Day-07-Methods)
