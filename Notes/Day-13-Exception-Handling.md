# ☕ Day 13 — Exception Handling

## 🎯 Concept
Exception handling is a mechanism to **handle runtime errors gracefully**, ensuring the normal flow of application execution is maintained rather than abruptly terminating. Java uses an object-oriented hierarchy rooted at `Throwable` (`Exception` and `Error`) controlled via `try`, `catch`, `finally`, `throw`, and `throws`.

## 🧠 Key Points
- **`try` Block:** Encloses code that may throw an exception.
- **`catch` Block:** Handles a specific exception type thrown inside the preceding `try` block.
- **Multiple Catch:** Specific exceptions must be caught before generalized ones (e.g., `ArithmeticException` before `Exception`).
- **`finally` Block:** Always executes whether an exception was raised, caught, or not (ideal for closing resources, streams, and connections).
- **Checked vs Unchecked Exceptions:**
  - *Checked (Compile-time):* Subclasses of `Exception` (excluding `RuntimeException`), e.g., `IOException`, `SQLException`. The compiler forces handling with `try-catch` or `throws`.
  - *Unchecked (Runtime):* Subclasses of `RuntimeException`, e.g., `NullPointerException`, `ArithmeticException`. Handling is optional.
- **`throw` vs `throws`:**
  - `throw`: Used inside a method to explicitly throw an exception object (`throw new IllegalArgumentException(...)`).
  - `throws`: Used in a method signature to declare that a method may pass checked exceptions to its caller.
- **Custom Exceptions:** Created by extending `Exception` (for checked) or `RuntimeException` (for unchecked).

## 💻 Code Example
```java
public class SafeDivision {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not permitted.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Handled: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
```
*(from `SafeDivision.java` & `TryCatchExample.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `TryCatchExample.java` | Basic exception handling with try-catch |
| `MultipleCatch.java` | Catching multiple specific exception types |
| `FinallyExample.java` | Demonstrates guaranteed finally block execution |
| `ThrowExample.java` | Explicitly throwing an exception |
| `ThrowsExample.java` | Declaring checked exceptions in method signatures |
| `SafeInput.java` | Scanner error handling with InputMismatchException |
| `InvalidAmountException.java` | Custom checked exception for banking |
| `BankAccount.java` | Transaction validation using custom exceptions |
| `BankingSimulator.java` | Banking menu simulator with error handling |
| `SafeDivision.java` | Safe arithmetic division with zero-check |
| `AgeValidation.java` | Validates input bounds using IllegalArgumentException |
| `FileReadingPractice.java` | Handles checked IOException during file operations |

## ⚠️ Common Mistakes
- Catching `Exception` or `Throwable` before specific exceptions like `ArithmeticException` (unreachable code error).
- Swallowing exceptions with an empty `catch` block (`catch(Exception e) {}`), hiding bugs completely.
- Using exception handling for regular control flow (slows performance and hurts code clarity).
- Forgetting that code inside `finally` executes even if `try` or `catch` contains a `return` statement.
- Calling `throw new Exception()` without declaring `throws Exception` on the enclosing method.

## ❓ Interview Questions
- **Q: What is the difference between `final`, `finally`, and `finalize()`?**  
  A: `final` is a keyword to declare constants, prevent inheritance, and stop method overriding. `finally` is a block that always executes after `try-catch`. `finalize()` was a garbage collection hook method (deprecated since Java 9).
- **Q: What is the difference between checked and unchecked exceptions?**  
  A: Checked exceptions are verified by the compiler at compile time and must be handled. Unchecked exceptions (`RuntimeException`) happen at runtime due to programming bugs and are not enforced by the compiler.
- **Q: Does `finally` always execute?**  
  A: Yes, except in rare scenarios like `System.exit(0)`, JVM crash, or fatal OS power failure.
- **Q: How do you create a custom checked exception?**  
  A: Create a class that extends `java.lang.Exception` and pass the error message to `super(message)`.

## 🔗 Practice Code
[📁 Day-13-Exception-Handling](../Day-13-Exception-Handling)

---
*🤖 Auto-generated note*
