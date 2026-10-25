# ☕ Day 04 — Loops

## 🎯 Concept
Loops **repeat** a block of code, so we do not write the same line again and again.

## 🧠 Key Points
- `for` → when the number of repetitions is known.
- `while` → repeat while a condition is true (condition checked first).
- `do-while` → runs **at least once** (condition checked after).
- `break` exits the loop; `continue` skips to the next iteration.
- Nested loops (loop inside a loop) are used for patterns and tables.
- Typical problems: factorial, prime check, Fibonacci, reverse a number, count digits, star patterns.

## 💻 Code Example
```java
boolean isPrime = true;

for (int i = 2; i < number; i++) {
    if (number % i == 0) {
        isPrime = false;
        break;
    }
}
```
*(from `PrimeNumber.java`)*

## ⚠️ Common Mistakes
- **Infinite loop:** forgetting to update the counter (`i++`).
- Off-by-one error: `<` vs `<=`.
- Factorial overflows `int` quickly (that is why `long` is used in `Factorial.java`; even `long` overflows after 20!).
- `break` inside a nested loop only exits the **inner** loop.
- Prime check can stop at `√n` instead of `n`, which is much faster.

## ❓ Interview Questions
- **Q: `while` vs `do-while`?**
  A: `do-while` always executes the body once before checking the condition.
- **Q: `break` vs `continue`?**
  A: `break` ends the loop; `continue` skips only the current iteration.
- **Q: Time complexity of the prime check above?**
  A: O(n). It can be improved to O(√n).
- **Q: What is a for-each loop?**
  A: `for (int x : arr)` iterates over every element without an index.

## 🔗 Practice Code
[📁 Day-04-Loops](../Day-04-Loops)
