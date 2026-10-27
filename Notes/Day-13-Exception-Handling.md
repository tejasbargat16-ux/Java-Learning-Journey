# ☕ Day 13 — Exception Handling

## 🎯 Concept
> ✍️ Write 2-3 lines in your own words about **Exception Handling**.

## 🧠 Key Points
- Exceptions and exception handling
- try and catch
- Multiple catch blocks
- finally
- throw and throws
- Checked and unchecked exceptions
- User input validation
- Custom exceptions
- File handling with IOException

**Spotted in your code:** Takes user input with `Scanner` · Uses `if` / `else` decisions · Uses arrays · Defines classes · Creates objects with `new` · Uses the `this` keyword · Uses `private` (encapsulation) · Uses inheritance (`extends`)

## 💻 Code Example
```java
public class AgeValidation {
    private int age;
    public void setAge(int age) {

        if (age < 1 || age > 120) {
            throw new IllegalArgumentException(
                    "Age must be between 1 and 120."
            );
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        AgeValidation person = new AgeValidation();

        try {
            person.setAge(20);
            System.out.println(
                    "Accepted age: " + person.getAge()
            );
            person.setAge(150);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Validation error: " + e.getMessage()
            );
        }
    }
}
```
*(from `AgeValidation.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `AgeValidation.java` | Input validation |
| `BankAccount.java` | Transaction validation |
| `BankingSimulator.java` | Banking simulator |
| `FileReadingPractice.java` | File reading and IOException |
| `FinallyExample.java` | Finally block |
| `InvalidAmountException.java` | Custom checked exception |
| `MultipleCatch.java` | Multiple catch blocks |
| `SafeDivision.java` | Division validation |
| `SafeInput.java` | Handling invalid user input |
| `ThrowExample.java` | Explicitly throwing an exception |
| `ThrowsExample.java` | Declaring a checked exception |
| `TryCatchExample.java` | Basic exception handling |

## ⚠️ Common Mistakes
- ✍️ What errors did you hit today?

## ❓ Interview Questions
- **Q:** ✍️ ...
  **A:** ...

## 🔗 Practice Code
[📁 Day-13-Exception-Handling](../Day-13-Exception-Handling)

---
*🤖 Auto-generated template: fill the ✍️ parts yourself*
