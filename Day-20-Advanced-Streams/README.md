# ☕ Java Day 20 — Advanced Streams, Optional & Collectors

Welcome to Day 20 of my Java Learning Journey!

Today, I explored advanced Java Streams operations, the `Optional` API for safe null handling, complex reductions with `Collectors`, grouping (`groupingBy`), and partitioning (`partitioningBy`).

## 🎯 Learning Objectives

- Master `Optional` methods (`of`, `ofNullable`, `map`, `filter`, `flatMap`, `orElse`, `orElseGet`, `orElseThrow`).
- Use standard and custom collectors (`toList`, `toSet`, `toMap`, `joining`, `summarizingDouble`).
- Aggregate and categorize data using single-level and multi-level `groupingBy`.
- Split collections into boolean groups using `partitioningBy`.
- Apply advanced stream operations: `flatMap`, `distinct`, `sorted`, `limit`, `skip`, `reduce`, `match`, and `peek`.
- Understand stream laziness and the single-use rule.
- Build a Student Result Analytics application using streams.

## 📚 Topics Covered

| Topic | Description |
|---|---|
| Optional API | Null-safe container preventing NullPointerException |
| Collectors | Aggregating and transforming stream elements |
| groupingBy | Categorizing objects by key into Map structures |
| partitioningBy | Splitting data into true/false groups via Predicates |
| flatMap | Flattening nested collections into a single stream |
| reduce | Folding stream elements into a single accumulated result |
| Stream Pipeline | Intermediate operations (lazy) vs terminal operations (eager) |

## 📂 Programs

1. `Employee.java` — Employee data model (id, name, department, city, salary, age).
2. `EmployeeData.java` — Sample dataset of employee records.
3. `OptionalDemo.java` — Demonstrating Optional creation, transformation, fallback, and filtering.
4. `CollectorsDemo.java` — Working with `toList`, `toSet`, `toMap`, `joining`, and `summarizing`.
5. `GroupingDemo.java` — Single/multi-level grouping, counting, averaging, and partitioning.
6. `AdvancedStreamOps.java` — `flatMap`, `distinct`, pagination (`skip`/`limit`), `reduce`, and `peek`.
7. `PracticeSolutions.java` — 5 practical problems solved using advanced stream pipelines.
8. `Student.java` — Student model with grading and pass/fail logic.
9. `StudentAnalyticsApp.java` — Mini-project analyzing student marks, toppers, and grade distribution.

## 📝 Practice Problems (Solved in `PracticeSolutions.java`)

- **P1:** Filter employees located in "Pune" with salary > 60,000, sorted alphabetically by name.
- **P2:** Group employees by city and count the number of employees in each city.
- **P3:** Find the department with the highest total salary expenditure.
- **P4:** Compute word frequency in a sentence using `Arrays.stream()` and `Collectors.groupingBy()`.
- **P5:** Partition numbers from 1 to 10 into even and odd, then calculate the sum of each group.

## 🚀 Mini Project: Student Result Analytics

A console application using Java Streams to process class performance:

- Computes total students, overall average, highest, and lowest marks via `IntSummaryStatistics`.
- Partitions students into passed and failed lists (`partitioningBy`).
- Computes branch-wise averages (`groupingBy` with `averagingInt`).
- Generates grade distribution and groups student names per grade.
- Identifies toppers in each engineering branch (`collectingAndThen` with `maxBy`).
- Ranks and displays the top 3 students.

## ▶️ Compile and Run

Compile all Java files:
```bash
javac *.java
```

Run any demo:
```bash
java OptionalDemo
java CollectorsDemo
java GroupingDemo
java AdvancedStreamOps
java PracticeSolutions
java StudentAnalyticsApp
```

## 🧠 Key Takeaways

- **`Optional` Best Practice:** Use `Optional` primarily as a return type to indicate possible absence of a value; avoid using it as method parameters or class fields.
- **Sorted Map Keys:** `groupingBy` creates a `HashMap` by default. Pass `TreeMap::new` as the map factory when keys must be ordered.
- **`partitioningBy` Structure:** Always returns a map containing both `true` and `false` keys, even if one group is empty.
- **Lazy Evaluation:** Intermediate operations (`filter`, `map`, `peek`) do not execute until a terminal operation (`collect`, `forEach`, `reduce`) is invoked.
- **Stream Single-Use:** A `Stream` cannot be reused once operated upon or closed; doing so throws an `IllegalStateException`.
