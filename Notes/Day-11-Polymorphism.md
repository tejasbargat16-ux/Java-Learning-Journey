# ☕ Day 11 — Polymorphism

## 🎯 Concept
Polymorphism means **"many forms"**: the same method call behaves differently depending on the object.

## 🧠 Key Points
| Type | Also called | How | Decided at |
|---|---|---|---|
| Compile-time | Static binding | Method **overloading** | Compile time |
| Runtime | Dynamic binding | Method **overriding** | Runtime |

- **Upcasting:** a parent reference can hold a child object (`Payment p = new UPIPayment();`).
- **Dynamic method dispatch:** the method that runs depends on the **actual object**, not the reference type.
- A parent reference can only call methods that exist in the parent class.
- Works nicely with arrays: `Animal[] animals = { new Dog(), new Cat() };`
- Big benefit: add a new class (like `WalletPayment`) without changing existing code.

## 💻 Code Example
```java
Payment payment;

payment = new UPIPayment();
payment.pay(500);        // Paid ₹500.0 using UPI.

payment = new CardPayment();
payment.pay(1200);       // card version runs
```
*(from `PaymentDemo.java`)*

## ⚠️ Common Mistakes
- Thinking the **reference type** decides which overridden method runs (it is the object type).
- Calling a child-only method through a parent reference → compile error (needs a downcast).
- Fields are **not** polymorphic; only methods are.
- `static` methods are hidden, not overridden.
- Unsafe downcast gives `ClassCastException`. Check with `instanceof` first.

## ❓ Interview Questions
- **Q: Compile-time vs runtime polymorphism?**
  A: Overloading is resolved by the compiler; overriding is resolved by the JVM at runtime.
- **Q: Can we override a static method?**
  A: No. It is method hiding.
- **Q: What is upcasting and downcasting?**
  A: Upcasting = child → parent (safe, automatic). Downcasting = parent → child (needs a cast, can fail).
- **Q: Why is polymorphism useful?**
  A: Flexible, extensible code. One `Shape` reference can calculate the area of a `Circle` or a `Rectangle`.

## 🔗 Practice Code
[📁 Day-11-Polymorphism](../Day-11-Polymorphism)
