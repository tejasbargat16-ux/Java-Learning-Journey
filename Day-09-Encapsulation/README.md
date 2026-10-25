# ☕ Day 09 — Encapsulation

## 🎯 Topics Covered
- The Encapsulation pillar of OOP
- Access modifiers: `private`, `public`
- Data hiding and variable protection
- Getter methods for controlled read access
- Setter methods for controlled write access
- Input validation inside setters
- Constructors with encapsulated fields
- Building robust, fault-tolerant domain models

## 📂 Programs
| File | Description |
|:---|:---|
| `EncapsulationBasic.java` | Basic demonstration of private fields and getters/setters |
| `Student.java` | Encapsulated Student class with validation |
| `StudentDemo.java` | Demonstrates controlled access to Student data |
| `SecureStudent.java` | Mini-project: Student object with strict validation |
| `BankAccount.java` | Bank account class with balance protection |
| `BankDemo.java` | Tests bank deposits and withdrawals with validation |
| `BankAccountPractice.java` | Practice: BankAccount with robust validation rules |
| `Person.java` | Person class with age validation rules |
| `Employee.java` | Encapsulated Employee class with salary rules |
| `EmployeeDemo.java` | Tests Employee getter and setter behavior |
| `Product.java` | Product class validating non-negative prices |
| `ProductDemo.java` | Demonstrates Product inventory operations |
| `Mobile.java` | Encapsulated Mobile model with price validation |

## 🧠 Key Learning
Encapsulation means bundling data and methods inside a class while hiding internal implementation details from direct outside modification. By making instance variables `private` and exposing `public` getters and setters, classes can validate input data, maintain invariants, and prevent corrupt states.

## 🏆 Status
- [x] Encapsulation concept & data hiding
- [x] `private` access modifier
- [x] Public getters & setters
- [x] Data validation inside setters
- [x] Balance protection (BankAccount)
- [x] Product price validation
- [x] Secure Student mini-project
- [x] GitHub documentation

## 🚀 Next
[Day 10 — Inheritance](../Day-10-Inheritance): Code reuse and hierarchy modeling using `extends`, `super`, constructor chaining, and method overriding.
