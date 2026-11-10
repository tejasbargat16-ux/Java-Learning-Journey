# ☕ Day 19 — Lambda Expressions & Functional Programming

## 🎯 Concept
Java 8 introduced **Lambda Expressions** and **Functional Interfaces** to bring functional programming capabilities to the object-oriented Java platform. A lambda expression is an anonymous function (a block of code with parameters and body, but no name) that provides a clean, concise way to implement single-method interfaces (`@FunctionalInterface`).

## 🧠 Key Points
- **Functional Interface:** An interface with exactly **one abstract method** (SAM - Single Abstract Method), annotated with `@FunctionalInterface`. Can still contain `default` and `static` methods.
- **Built-in Functional Interfaces (`java.util.function`):**
  - `Predicate<T>`: `boolean test(T t)` — tests a condition.
  - `Consumer<T>`: `void accept(T t)` — accepts input and performs side-effects.
  - `Supplier<T>`: `T get()` — provides a value without taking input.
  - `Function<T, R>`: `R apply(T t)` — transforms an input $T$ into an output $R$.
- **Lambda Syntax:** `(parameters) -> expression` or `(parameters) -> { statements; }`.
- **Method References (`::`):** A shorthand syntax for lambdas that directly invoke an existing method (e.g., `System.out::println`, `String::toUpperCase`, `Integer::sum`).
- **Stream API Basics:** Core methods `filter()`, `map()`, `sorted()`, `reduce()`, and `forEach()` processing collections declaratively.

## 💻 Code Example
```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaBasicDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "JavaScript", "C++");

        // Predicate lambda
        Predicate<String> startsWithJ = s -> s.startsWith("J");

        // Filter and forEach with Method Reference
        names.stream()
             .filter(startsWithJ)
             .forEach(System.out::println);
    }
}
```
*(from `LambdaBasic.java` & `GreetingDemo.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `GreetingDemo.java` | Anonymous inner class vs functional interface implementation |
| `LambdaBasic.java` | Basic syntax and execution of single-line lambda expressions |
| `LambdaParameters.java` | Passing single and multiple parameters to lambda expressions |
| `LambdaMultipleStatements.java` | Multi-statement lambda blocks with explicit return statements |
| `FunctionalInterfacesDemo.java` | Built-in interfaces: Predicate, Consumer, Supplier, Function |
| `MethodReferenceDemo.java` | Static, instance, and constructor method references |
| `ForEachLambda.java` | Iterating and processing collection items with forEach |
| `StreamBasic.java` | Creating and consuming basic streams from collections |
| `StreamMapSort.java` | Transforming elements with map and sorting with custom Comparators |
| `StreamOperations.java` | Combining filter, map, and collect in a single stream pipeline |
| `LambdaSorting.java` | Sorting lists using Comparator lambdas and thenComparing |
| `PredicatePractice.java` | Chaining conditions with and(), or(), and negate() |
| `FunctionPractice.java` | Function transformations and composition with andThen() |
| `FilterPractice.java` | Stream filtering on domain models |
| `ReducePractice.java` | Folding and aggregating elements using reduce |
| `SortNamesPractice.java` | Sorting string collections by length and alphabetical order |
| `StudentResultAnalyzer.java` | Mini-project: Student marks analysis using Streams and Lambdas |

## ⚠️ Common Mistakes
- Trying to write lambdas for interfaces with more than one abstract method.
- Accessing local variables inside a lambda that are not `effectively final` (mutating variables from the outer scope triggers a compiler error).
- Adding redundant type declarations in lambda arguments when compiler type inference already knows them.
- Forgetting curly braces `{}` or missing `return` statements in multi-line lambdas.
- Overusing lambdas where a clear method reference is more readable (e.g., `x -> System.out.println(x)` vs `System.out::println`).

## ❓ Interview Questions
- **Q: What is a Functional Interface?**  
  A: An interface containing exactly one abstract method. It can have any number of default or static methods. It is marked with `@FunctionalInterface`.
- **Q: Can a lambda expression access local variables?**  
  A: Yes, but only if they are `final` or `effectively final` (their value does not change after initialization).
- **Q: What are the four primary functional interfaces in `java.util.function`?**  
  A: `Predicate<T>` (boolean test), `Consumer<T>` (void action), `Supplier<T>` (produces value), and `Function<T, R>` (transforms input to output).
- **Q: What is the difference between an Anonymous Inner Class and a Lambda Expression?**  
  A: An anonymous inner class creates a new `.class` file and has its own `this` scope. A lambda expression uses `invokedynamic` bytecode, does not generate a separate class file, and shares the enclosing lexical scope (`this` refers to the outer class).

## 🔗 Practice Code
[📁 Day-19-Lambda-Functional-Programming](../Day-19-Lambda-Functional-Programming)

---
*🤖 Auto-generated note*
