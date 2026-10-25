# ☕ Day 10 — Inheritance

## 🎯 Concept
Inheritance lets a **child class reuse** the fields and methods of a **parent class** using `extends`. It models an **"is-a"** relationship (Dog **is an** Animal).

## 🧠 Key Points
- Syntax: `class Child extends Parent { }`
- Child gets parent's non-private members and can add its own.
- **`super`**: `super(args)` calls the parent constructor; `super.method()` calls the parent's method.
- **Constructor chaining:** the parent constructor always runs first. `super(...)` must be the first line in the child constructor.
- **Method overriding:** the child gives its own version of an inherited method. Use `@Override`.
- Java supports single, multilevel and hierarchical inheritance. **No multiple inheritance with classes.**

## 💻 Code Example
```java
public class Student extends Person {
    String branch;

    Student(String name, int age, String branch) {
        super(name, age);
        this.branch = branch;
    }

    void displayStudent() {
        super.displayDetails();
        System.out.println("Branch: " + branch);
    }
}
```
*(from `Student.java`)*

## ⚠️ Common Mistakes
- Parent has only a parameterized constructor and the child does not call `super(...)` → compile error.
- Trying to override `private`, `static` or `final` methods.
- Using inheritance where there is no "is-a" relation (a Car **has an** Engine, it is not an Engine).
- Forgetting `@Override`, so a typo creates a new method instead of overriding.

## ❓ Interview Questions
- **Q: Why does Java not support multiple inheritance with classes?**
  A: To avoid the diamond problem (ambiguity). Interfaces solve this.
- **Q: `super` vs `this`?**
  A: `this` = current object; `super` = parent part of the object.
- **Q: Are constructors inherited?**
  A: No, but the child constructor must call a parent constructor.
- **Q: Which class is the parent of every class?**
  A: `java.lang.Object`.

## 🔗 Practice Code
[📁 Day-10-Inheritance](../Day-10-Inheritance)
