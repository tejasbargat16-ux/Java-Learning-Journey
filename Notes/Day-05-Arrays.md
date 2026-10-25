# ☕ Day 05 — Arrays

## 🎯 Concept
An array stores **multiple values of the same type** under one name, with a fixed size.

## 🧠 Key Points
- Declare + create: `int[] numbers = new int[5];` or `int[] a = {1, 2, 3};`
- Index starts at **0**; last index is `length - 1`.
- `arr.length` is a property (no brackets).
- Default values: `0` for int, `0.0` for double, `false` for boolean, `null` for objects.
- Common operations: sum, average, max, min, search, reverse, sort.
- **Bubble Sort:** repeatedly swap neighbouring elements if they are in the wrong order.
- 2D array = array of arrays (`int[][] matrix = new int[3][3];`), used for matrices.

## 💻 Code Example
```java
for (int i = 0; i < numbers.length - 1; i++) {
    for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
```
*(Bubble Sort from `SortArray.java`)*

## ⚠️ Common Mistakes
- `ArrayIndexOutOfBoundsException`: using `i <= arr.length` instead of `i < arr.length`.
- Confusing `arr.length` (array), `str.length()` (String) and `list.size()` (ArrayList).
- `System.out.println(arr)` prints a memory address. Use `Arrays.toString(arr)`.
- Array size cannot change after creation.

## ❓ Interview Questions
- **Q: Array vs `ArrayList`?**
  A: Array has fixed size and holds primitives; `ArrayList` grows dynamically and holds objects.
- **Q: Time complexity of bubble sort?**
  A: O(n²) worst case. Best case O(n) if you add an "already sorted" flag.
- **Q: Are arrays objects in Java?**
  A: Yes, they live on the heap and have a `length` field.
- **Q: What is a jagged array?**
  A: A 2D array whose rows have different lengths.

## 🔗 Practice Code
[📁 Day-05-Arrays](../Day-05-Arrays)
