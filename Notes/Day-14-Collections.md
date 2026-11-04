# ☕ Day 14 — Collections

## 🎯 Concept
The **Java Collections Framework (JCF)** provides a unified architecture for storing, manipulating, and managing groups of objects in memory. It replaces static arrays with dynamic, resizable data structures like **List**, **Set**, and **Map**, providing ready-to-use implementations such as `ArrayList`, `HashSet`, and `HashMap`.

## 🧠 Key Points
- **Core Interfaces:**
  - `List`: Ordered collection that permits duplicates and index-based access (e.g., `ArrayList`, `LinkedList`).
  - `Set`: Unordered collection of unique items; does not allow duplicate elements (e.g., `HashSet`, `TreeSet`).
  - `Map`: Stores key-value mappings where keys must be unique (e.g., `HashMap`, `TreeMap`). Not part of the `Collection` root interface.
- **`ArrayList`:** Resizable dynamic array. Fast for random access (`get(i)` is $O(1)$), slower for insertions/deletions in the middle ($O(n)$).
- **`HashSet`:** Backed by a hash table. Provides average $O(1)$ time complexity for `add()`, `remove()`, and `contains()`.
- **`HashMap`:** Stores `<Key, Value>` pairs. Uses hashing for fast retrieval (`get(key)` is average $O(1)$).
- **Iterating Collections:** Using standard `for-each` loops, Java `Iterator`, or Java 8 `forEach` with lambda expressions.
- **Generics with Collections:** Enforces type safety at compile time (`ArrayList<String>` prevents inserting invalid types).

## 💻 Code Example
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List (ordered, permits duplicates)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        // Set (unique elements only)
        HashSet<String> uniqueFruits = new HashSet<>(fruits); // duplicates removed

        // Map (Key-Value associations)
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 50);
        stock.put("Banana", 30);

        System.out.println("List: " + fruits);
        System.out.println("Set: " + uniqueFruits);
        System.out.println("Stock of Apple: " + stock.get("Apple"));
    }
}
```
*(from `ArrayListExample.java` & `HashMapExample.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `ArrayListExample.java` | Dynamic list creation, updates, indexing, and removal |
| `HashSetExample.java` | Storing unique elements and filtering duplicates |
| `HashMapExample.java` | Key-value storage, lookup, keySet, and updates |
| `CollectionIteration.java` | Traversing collections using for-each and Iterator |
| `ShoppingList.java` | Practical ArrayList exercise for item management |
| `UniqueSkills.java` | Practical HashSet exercise for tracking unique skill sets |
| `MarksLookup.java` | Practical HashMap exercise for student mark lookups |
| `Student.java` | Model class representing student entities |
| `StudentManagement.java` | Mini-project: Student CRUD management using HashMap |

## ⚠️ Common Mistakes
- Modifying a collection directly inside a standard for-each loop triggers `ConcurrentModificationException` (use an `Iterator` or `removeIf`).
- Using primitive types as generic arguments (`ArrayList<int>` fails; use wrapper class `ArrayList<Integer>`).
- Forgetting that `HashSet` and `HashMap` do not guarantee insertion order (use `LinkedHashSet` or `LinkedHashMap` if order is needed).
- Overlooking that duplicate keys in `HashMap.put(k, v)` overwrite the previous value.
- Trying to get an element by index in a `Set` (`Set` does not have `.get(index)`).

## ❓ Interview Questions
- **Q: What is the difference between an Array and an ArrayList?**  
  A: Arrays have a fixed size and can hold primitives and objects. `ArrayList` is dynamically resizable, supports rich utility methods, and holds only objects/wrappers.
- **Q: What is the difference between `List` and `Set`?**  
  A: `List` maintains insertion order and allows duplicates; `Set` enforces uniqueness and does not guarantee insertion order.
- **Q: How does `HashMap` work internally?**  
  A: It uses an array of buckets (nodes/linked lists or red-black trees). It calculates `hashCode()` of the key to find the bucket index and uses `equals()` to find or resolve matching keys.
- **Q: What is `Iterator` and why use it over for-each?**  
  A: `Iterator` provides a safe way to remove elements during iteration (`it.remove()`) without throwing `ConcurrentModificationException`.

## 🔗 Practice Code
[📁 Day-14-Collections](../Day-14-Collections)

---
*🤖 Auto-generated note*
