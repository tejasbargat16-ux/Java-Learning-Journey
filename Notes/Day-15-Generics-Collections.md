# ☕ Day 15 — Generics & Advanced Collections

## 🎯 Concept
**Java Generics** allow classes, interfaces, and methods to operate on parameterized types. They provide compile-time type safety, eliminate manual type casting, and reduce runtime `ClassCastException` risks. Combined with the `Collections` utility class, `Comparable`, and `Comparator`, generics enable powerful and reusable data algorithms.

## 🧠 Key Points
- **Type Parameters:** Written inside angle brackets `<T>` (Type), `<E>` (Element), `<K, V>` (Key, Value).
- **Generic Classes:** A single class definition that can store and manipulate different data types (`class GenericBox<T>`).
- **Generic Methods:** Methods that introduce their own type parameters independent of the class (`<T> void printArray(T[] items)`).
- **Multiple Type Parameters:** Classes like `Pair<K, V>` holding two distinct types simultaneously.
- **Bounded Type Parameters:** Restrict acceptable types using `extends` (e.g., `<T extends Number>` allows only numeric types like `Integer` and `Double`).
- **Sorting Collections:**
  - `Comparable<T>` interface: Defines natural ordering via single method `compareTo(T o)`.
  - `Comparator<T>` interface: Defines custom external ordering via `compare(T o1, T o2)`.
  - `Collections.sort()` & `Collections.reverse()`: Sort and reverse lists in place.
- **Generic Repository Pattern:** Encapsulates CRUD operations in a reusable, type-safe data access class.

## 💻 Code Example
```java
// Generic class with type parameter T
class GenericBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        // Type-safe: compiler enforces type, no manual casts needed
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("Generics in Java");
        System.out.println("String: " + stringBox.getItem());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(100);
        System.out.println("Integer: " + intBox.getItem());
    }
}
```
*(from `GenericBox.java` & `GenericBoxDemo.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `GenericListExample.java` | Demonstrates compile-time type safety with generic lists |
| `GenericBox.java` | Generic class wrapping an object of type T |
| `GenericBoxDemo.java` | Reusing GenericBox across different data types |
| `Pair.java` | Class with multiple type parameters (K, V) |
| `PairDemo.java` | Practical use of key-value pair structures |
| `GenericMethodDemo.java` | Declaring and invoking generic methods |
| `GenericPrinter.java` | Generic utility printing arrays of any type |
| `BoundedGenericDemo.java` | Constraining generic types using `<T extends Number>` |
| `GenericMaximum.java` | Finding maximum element with `<T extends Comparable<T>>` |
| `CollectionsSortDemo.java` | Sorting and reversing collections using Collections class |
| `StudentSorter.java` | Custom sorting using Comparable and Comparator |
| `MarksSorter.java` | Sorting student marks in ascending and descending orders |
| `GenericRepository.java` | Reusable generic in-memory repository pattern |
| `GenericRepositoryDemo.java` | Demonstration of generic repository CRUD operations |

## ⚠️ Common Mistakes
- Cannot create instances of type parameters directly (`new T()` is invalid due to type erasure).
- Cannot use primitive types in generics (`List<int>` is invalid; use `List<Integer>`).
- Cannot declare `static` fields with the class type parameter (`private static T item;` is illegal).
- Cannot create generic arrays directly (`T[] array = new T[10];` causes a compiler error).
- Confusing `extends` in generics: `<T extends Number>` means $T$ must be a subtype of `Number`, regardless of whether `Number` is a class or interface.

## ❓ Interview Questions
- **Q: What is Type Erasure in Java?**  
  A: Type erasure is the compile-time process where the Java compiler replaces generic type parameters with their bounds (or `Object`) and inserts casts, ensuring backwards compatibility with older JVM versions.
- **Q: What is the difference between `Comparable` and `Comparator`?**  
  A: `Comparable` gives objects a single natural sorting order via `compareTo()` inside the class itself. `Comparator` provides multiple, flexible custom sorting orders via external `compare()` implementations.
- **Q: What are bounded type parameters?**  
  A: Bounded type parameters restrict the types that can be passed to a type parameter (e.g., `<T extends Number>` only accepts numbers).
- **Q: What is the wildcard `?` in Java Generics?**  
  A: The wildcard `?` represents an unknown type: `<?>` (unbounded), `<? extends T>` (upper bounded: read-only), and `<? super T>` (lower bounded: write-friendly).

## 🔗 Practice Code
[📁 Day-15-Generics-Collections](../Day-15-Generics-Collections)

---
*🤖 Auto-generated note*
