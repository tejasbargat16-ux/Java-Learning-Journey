# ☕ Day 10 — Inheritance

## 🎯 Topics Covered
- The Inheritance pillar of OOP
- Parent (superclass) and Child (subclass) relationships
- The `extends` keyword
- The `super` keyword for parent methods and constructors
- Constructor chaining across inheritance hierarchies
- Method overriding and the `@Override` annotation
- Code reuse and hierarchical domain modeling
- Multilevel and hierarchical inheritance patterns

## 📂 Programs
| File | Description |
|:---|:---|
| `Animal.java` | Superclass defining generic animal behaviors |
| `Dog.java` | Subclass inheriting from Animal |
| `AnimalDemo.java` | Demonstrates basic inheritance and method reuse |
| `Person.java` | Parent class with parameterized constructor |
| `Student.java` | Subclass calling `super()` and `super.display()` |
| `StudentDemo.java` | Demonstrates student inheritance and constructor chaining |
| `TeacherPractice.java` | Practice: Teacher inheriting from Person with subject specializations |
| `Vehicle.java` | Superclass with generic vehicle operations |
| `Car.java` | Subclass overriding parent methods with `@Override` |
| `VehicleDemo.java` | Demonstrates method overriding in action |
| `Main.java` | Practice: VehiclePractice and BikePractice subclassing |
| `RectanglePractice.java` | Practice: Rectangle overriding Shape area method |
| `Employee.java` | Superclass for workplace personnel |
| `Developer.java` | Subclass extending Employee with specialized roles |
| `EmployeeManagement.java` | Comprehensive inheritance mini-project |

## 🧠 Key Learning
Inheritance allows a child class to inherit fields and methods from a parent class, eliminating duplicated code. A child class extends a parent with `extends`, calls parent constructors with `super()`, and can override inherited methods using `@Override` to provide specialized behavior.

## 🏆 Status
- [x] Inheritance fundamentals & `extends`
- [x] Superclass & subclass hierarchy
- [x] `super` keyword & constructor chaining
- [x] Method overriding with `@Override`
- [x] Hierarchical inheritance (Vehicle, Animal, Person)
- [x] Employee Management mini-project
- [x] GitHub documentation

## 🚀 Next
[Day 11 — Polymorphism](../Day-11-Polymorphism): Mastering compile-time overloading, runtime dynamic dispatch, and polymorphism with arrays and interfaces.
