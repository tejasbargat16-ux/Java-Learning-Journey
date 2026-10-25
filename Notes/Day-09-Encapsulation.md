# ☕ Day 09 — Encapsulation

## 🎯 Concept
Encapsulation means **hiding an object's data** (`private`) and allowing access only through **public methods** (getters/setters). The class stays in control of its own data.

## 🧠 Key Points
- Make fields `private`; expose `getX()` and `setX()` only where needed.
- Setters and constructors can **validate** data before storing it.
- Read-only field = getter without setter.
- Benefits: data protection, validation, flexibility to change internals, easier maintenance.
- Access modifiers: `private` (same class) → default (same package) → `protected` (package + subclasses) → `public` (everywhere).

## 💻 Code Example
```java
private double balance;

public double getBalance() {
    return balance;
}

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    }
}
```
*(from `BankAccount.java`)*

## ⚠️ Common Mistakes
- Keeping fields `public`, so anyone can set `balance = -5000`.
- Setters without validation (encapsulation in name only).
- Making a setter for every field even when it should be read-only (like account number).
- Forgetting `this.` when parameter and field names are the same.

## ❓ Interview Questions
- **Q: What are the 4 pillars of OOP?**
  A: Encapsulation, Inheritance, Polymorphism, Abstraction.
- **Q: How do you achieve encapsulation in Java?**
  A: Private fields + public getters/setters (with validation).
- **Q: Encapsulation vs abstraction?**
  A: Encapsulation hides data (how it is stored). Abstraction hides complexity (how it works) and shows only what is needed.
- **Q: What is a POJO / JavaBean?**
  A: A plain class with private fields, a no-arg constructor and getters/setters.

## 🔗 Practice Code
[📁 Day-09-Encapsulation](../Day-09-Encapsulation)
