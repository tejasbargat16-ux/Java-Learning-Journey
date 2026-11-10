# ☕ Day 20 — Advanced Streams, Optional & Collectors

## 🎯 Concept
Advanced Streams elevate Java functional programming by providing sophisticated tools for data aggregation, transformation, and safe execution. The **`Optional<T>`** container eliminates hazardous `null` references, while **`Collectors`** (`groupingBy`, `partitioningBy`, `joining`, `summarizing`) enable complex multi-level grouping and statistical reductions on collections with clean, declarative syntax.

## 🧠 Key Points
- **`Optional<T>`:** A container object that may or may not contain a non-null value.
  - Creation: `Optional.of(val)` (throws NPE if null), `Optional.ofNullable(val)` (handles null safely), `Optional.empty()`.
  - Consumption: `ifPresent(Consumer)`, `orElse(defaultVal)`, `orElseGet(Supplier)`, `orElseThrow()`.
  - Transformation: `map()`, `flatMap()`, `filter()`.
- **`Collectors.groupingBy()`:** Groups stream elements according to a classification function, storing results in a `Map<K, List<T>>` or with downstream collectors (like `counting()`, `averagingDouble()`, `mapping()`).
- **`Collectors.partitioningBy()`:** A specialized 2-group classification that splits elements based on a `Predicate`, returning a `Map<Boolean, ...>`.
- **`flatMap()`:** Flattens multiple streams or nested collections into a single continuous stream (`Stream<List<T>>` $\to$ `Stream<T>`).
- **`reduce()`:** Performs a reduction on elements using an associative accumulation function (e.g., sum, product, max).
- **Stream Laziness & Single-Use:** Intermediate operations are never executed until a terminal operation is called. Once consumed, a stream cannot be operated upon again.

## 💻 Code Example
```java
import java.util.*;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        // Group employees by department and calculate average salary
        Map<String, Double> avgSalaryPerDept = emps.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        TreeMap::new,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avgSalaryPerDept.forEach((dept, avg) ->
                System.out.printf("%s -> ₹%.2f%n", dept, avg));

        // Partition by salary >= 60,000
        Map<Boolean, List<String>> partitionedNames = emps.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() >= 60000,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println("High Earners: " + partitionedNames.get(true));
        System.out.println("Standard Earners: " + partitionedNames.get(false));
    }
}
```
*(from `GroupingDemo.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `Employee.java` | Immutable employee data model |
| `EmployeeData.java` | Sample data generator providing employee records |
| `OptionalDemo.java` | Complete walkthrough of Optional methods and fallbacks |
| `CollectorsDemo.java` | Collection transformations: toList, toSet, toMap, joining, statistics |
| `GroupingDemo.java` | Single and nested multi-level groupingBy and partitioningBy |
| `AdvancedStreamOps.java` | flatMap, distinct, pagination (skip/limit), reduce, and peek |
| `PracticeSolutions.java` | Solutions for 5 core real-world Stream interview problems |
| `Student.java` | Student model with marks evaluation and grade logic |
| `StudentAnalyticsApp.java` | Mini-project: Class result analytics and branch toppers |

## ⚠️ Common Mistakes
- Using `Optional.get()` without first checking `isPresent()` (triggers `NoSuchElementException`; prefer `orElse()`, `orElseGet()`, or `orElseThrow()`).
- Using `Optional` for class fields, method arguments, or collections (hurts serialization and adds memory overhead).
- Attempting to reuse a stream after a terminal operation has already executed (`IllegalStateException: stream has already been operated upon or closed`).
- Assuming `groupingBy` returns an ordered map by default (it creates a `HashMap`; pass `TreeMap::new` or `LinkedHashMap::new` if order is required).
- Expecting intermediate operations (`filter`, `map`, `peek`) to execute without calling a terminal operation.

## ❓ Interview Questions
- **Q: What is the difference between `map()` and `flatMap()` in Streams?**  
  A: `map()` transforms each stream element into another single element ($1 \to 1$). `flatMap()` transforms each element into a stream of elements and flattens all resulting streams into one ($1 \to \text{many}$).
- **Q: What is the difference between `orElse()` and `orElseGet()` in Optional?**  
  A: `orElse(defaultValue)` evaluates the argument eagerly whether the Optional is empty or not. `orElseGet(Supplier)` evaluates lazily only when the Optional is truly empty, making it preferred for expensive default computations.
- **Q: What is the difference between `groupingBy` and `partitioningBy`?**  
  A: `groupingBy` classifies data into arbitrary keys defined by a classifier function (`Map<K, V>`). `partitioningBy` classifies data strictly into two boolean keys (`true` and `false`) defined by a `Predicate`.
- **Q: Why are Stream intermediate operations described as "lazy"?**  
  A: They do not process elements immediately when declared. Instead, they form a pipeline that only executes when a terminal operation (like `collect()`, `forEach()`, or `reduce()`) is called, allowing optimization and short-circuiting.

## 🔗 Practice Code
[📁 Day-20-Advanced-Streams](../Day-20-Advanced-Streams)

---
*🤖 Auto-generated note*
