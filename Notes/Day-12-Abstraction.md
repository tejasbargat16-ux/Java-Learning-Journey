# ☕ Day 12 — Abstraction

## 🎯 Concept
Abstraction is the OOP principle of **hiding internal implementation details** while exposing only the essential features to the outside world. In Java, abstraction is achieved using **abstract classes** (partial abstraction: 0–100%) and **interfaces** (pure contract / full abstraction: 100%).

## 🧠 Key Points
- **Abstract Class:** Declared with the `abstract` keyword. Cannot be instantiated directly (`new Animal()` is illegal).
- **Abstract Method:** Has a declaration but no body (`abstract void sound();`). Concrete subclasses **must** override and provide the implementation.
- **Concrete Members:** Abstract classes can have normal methods, constructors, instance variables, and `static` or `final` fields.
- **Constructors in Abstract Classes:** Even though you cannot instantiate an abstract class directly, its constructor is called via `super()` when a child object is instantiated.
- **Interface:** A blueprint of a class. Methods are `public abstract` by default; fields are `public static final`.
- **`implements` vs `extends`:** A class `extends` one class (single class inheritance) but can `implements` multiple interfaces (multiple inheritance of type).
- **Runtime Polymorphism:** A parent abstract class or interface reference can refer to any subclass object (`PaymentMethod p = new UPIPayment();`).

## 💻 Code Example
```java
abstract class Animal {
    abstract void sound(); // abstract method: must be implemented

    void sleep() {         // concrete method: inherited as-is
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting to abstract class reference
        animal.sound();            // Dog barks: Woof Woof!
        animal.sleep();            // Animal is sleeping.
    }
}
```
*(from `AnimalDemo.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `Animal.java` | Abstract class defining animal contract |
| `Dog.java` | Concrete subclass implementing abstract sound() |
| `AnimalDemo.java` | Demonstrates abstract class polymorphism |
| `Shape.java` | Abstract shape class with area calculation |
| `Circle.java` | Circle implementation extending Shape |
| `ShapeDemo.java` | Shape abstraction demonstration |
| `Playable.java` | Interface defining play() contract |
| `Guitar.java` | Guitar implementing Playable interface |
| `Piano.java` | Piano implementing Playable interface |
| `InterfaceDemo.java` | Polymorphic execution using interface types |
| `PaymentMethod.java` | Abstract payment base with account tracking |
| `UPIPayment.java` | UPI payment implementation |
| `CardPayment.java` | Card payment implementation |
| `PaymentSystemDemo.java` | Payment processing mini-project |
| `VehicleAbstractionDemo.java` | Vehicle abstraction practice |
| `PrintableDemo.java` | Multiple interface printable practice |
| `PayrollDemo.java` | Employee payroll abstraction practice |

## ⚠️ Common Mistakes
- Attempting to instantiate an abstract class (`Animal a = new Animal();` fails compilation).
- Forgetting to provide a body for an abstract method in a non-abstract subclass.
- Marking an abstract method as `private` or `final` (which prevents overriding and triggers a compiler error).
- Reducing access visibility when implementing an interface method (interface methods are `public`, so the overriding method must be `public`).
- Using an abstract class when an interface is sufficient (use interfaces for contracts across unrelated classes; use abstract classes for shared code and state).

## ❓ Interview Questions
- **Q: What is the difference between an abstract class and an interface?**  
  A: An abstract class can have constructors, instance state, and non-abstract methods, supporting single inheritance. An interface defines a pure contract (with default/static methods since Java 8), and a class can implement multiple interfaces.
- **Q: Can an abstract class have a constructor?**  
  A: Yes. It is invoked during subclass constructor chaining via `super()` to initialize abstract class fields.
- **Q: Can an abstract class have zero abstract methods?**  
  A: Yes. Marking a class `abstract` simply prevents direct instantiation, even if all methods are concrete.
- **Q: Can an abstract method be static or final?**  
  A: No. `static` methods cannot be overridden polymorphically, and `final` explicitly forbids overriding, contradicting the purpose of an abstract method.

## 🔗 Practice Code
[📁 Day-12-Abstraction](../Day-12-Abstraction)

---
*🤖 Auto-generated note*
