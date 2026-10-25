# ☕ Day 08 — Classes & Objects

## 🎯 Concept
A **class** is a blueprint; an **object** is a real instance created from it. A class bundles **data (fields)** and **behaviour (methods)** together. This is the start of OOP.

## 🧠 Key Points
- Create an object: `Student s = new Student();`
- Fields (instance variables) are separate for every object.
- Access with the dot operator: `s.name`, `s.displayDetails()`.
- **Constructor:** same name as the class, no return type, runs on `new`.
  - Default constructor (no parameters) / parameterized constructor.
  - If you write no constructor, Java gives a default one. If you write any, it does not.
- **`this`** refers to the current object. It separates field names from parameter names.
- Objects live on the **heap**; the reference variable lives on the stack.

## 💻 Code Example
```java
ThisKeyword(String name, int age) {
    this.name = name;
    this.age = age;
}

ThisKeyword student = new ThisKeyword("Tejas", 20);
```
*(from `ThisKeyword.java`)*

## ⚠️ Common Mistakes
- Forgetting `new` (the reference stays `null` → `NullPointerException`).
- `name = name;` in a constructor (assigns the parameter to itself). Use `this.name = name;`.
- Adding a return type to a constructor makes it a normal method.
- Writing a parameterized constructor and then calling `new Student()` with no arguments.

## ❓ Interview Questions
- **Q: Class vs object?**
  A: Class is a template; object is an instance with its own state.
- **Q: What is a constructor? Can it be overloaded?**
  A: A special method to initialize objects. Yes, with different parameter lists.
- **Q: What does `this` do?**
  A: Refers to the current object; can also call another constructor with `this(...)`.
- **Q: Where are objects stored?**
  A: On the heap; references are on the stack.

## 🔗 Practice Code
[📁 Day-08-Classes-Objects](../Day-08-Classes-Objects)
