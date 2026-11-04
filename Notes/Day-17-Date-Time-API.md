# ☕ Day 17 — Date & Time API

## 🎯 Concept
Java 8 introduced the modern **Date and Time API (`java.time`)** to replace legacy and flawed classes (`java.util.Date` and `Calendar`). The modern API is **immutable**, **thread-safe**, timezone-aware, and adheres to ISO calendar standards, making date calculations and formatting intuitive and clean.

## 🧠 Key Points
- **`LocalDate`:** Represents date without time (e.g., `2026-11-04`). Supports operations like `.plusDays()`, `.minusMonths()`.
- **`LocalTime`:** Represents time without date (e.g., `14:30:15`).
- **`LocalDateTime`:** Combines date and time without time zones (e.g., `2026-11-04T14:30:15`).
- **`ZonedDateTime` & `ZoneId`:** Handles dates and times with specific geographic timezones (e.g., `ZoneId.of("Asia/Kolkata")`).
- **`Instant`:** Represents an instantaneous point on the timeline in UTC epoch seconds, ideal for server logging and machine timestamps.
- **`DateTimeFormatter`:** Formats date/time objects into readable strings and parses custom strings back into date objects via patterns (e.g., `"dd-MM-yyyy HH:mm:ss"`).
- **`Period` vs `Duration`:**
  - `Period`: Date-based amount of time (years, months, days), e.g., `Period.between(dob, today)`.
  - `Duration`: Time-based amount of time (seconds, nanoseconds, hours), e.g., `Duration.between(start, end)`.
- **`ChronoUnit`:** Enum providing convenient units for measuring elapsed time (`ChronoUnit.DAYS.between(d1, d2)`).

## 💻 Code Example
```java
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2004, 8, 15);

        // Date arithmetic & period
        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months");

        // Custom formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Parsing
        LocalDate parsedDate = LocalDate.parse("25/12/2026", formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
```
*(from `LocalDateExample.java`, `PeriodExample.java` & `DateFormatterExample.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `LocalDateExample.java` | Working with dates, current date, and date manipulation |
| `LocalTimeExample.java` | Working with time of day and time arithmetic |
| `LocalDateTimeExample.java` | Managing combined date and time stamps |
| `TimeZoneExample.java` | Working with ZoneId and ZonedDateTime |
| `InstantExample.java` | Machine-readable UTC epoch timestamps |
| `DateFormatterExample.java` | Formatting dates and times into custom patterns |
| `DateParsing.java` | Parsing user input strings into LocalDate objects |
| `PeriodExample.java` | Measuring elapsed date spans (years, months, days) |
| `DurationExample.java` | Measuring elapsed time intervals (hours, minutes, seconds) |
| `AgeCalculator.java` | Accurate age calculation application using Period |
| `ExamCountdown.java` | Countdown calculation of remaining days until exam dates |
| `MeetingScheduler.java` | Scheduling future meetings and validating conflict-free dates |
| `TaskDeadlineManager.java` | Mini-project: Task deadline tracker highlighting overdue tasks |

## ⚠️ Common Mistakes
- Trying to modify `LocalDate` objects directly without reassigning (they are immutable: `date.plusDays(5)` does nothing unless written as `date = date.plusDays(5)`).
- Using `Period` on `LocalTime` or `Duration` on `LocalDate` (causes `DateTimeException` or `UnsupportedTemporalTypeException`).
- Confusing lowercase `m` (minutes) and uppercase `M` (months) in `DateTimeFormatter` patterns (e.g., `dd-mm-yyyy` formats with minutes instead of month!).
- Parsing strings without matching the exact pattern declared in the `DateTimeFormatter`.
- Using legacy `java.util.Date` or `SimpleDateFormat` which are not thread-safe.

## ❓ Interview Questions
- **Q: Why was the `java.time` package introduced in Java 8?**  
  A: Legacy `java.util.Date` and `Calendar` had flawed zero-indexed months, lacked immutability, and `SimpleDateFormat` was not thread-safe. `java.time` is immutable, thread-safe, and clear.
- **Q: What is the difference between `Period` and `Duration`?**  
  A: `Period` measures date differences in terms of years, months, and days. `Duration` measures time intervals in terms of seconds, minutes, and hours.
- **Q: Are objects in `java.time` mutable or immutable?**  
  A: All core classes in `java.time` are strictly immutable and thread-safe. Every manipulation returns a brand-new instance.
- **Q: How does `Instant` differ from `LocalDateTime`?**  
  A: `Instant` represents a machine timestamp relative to Unix epoch in UTC. `LocalDateTime` represents a human-readable date and time without any timezone context.

## 🔗 Practice Code
[📁 Day-17-Date-Time-API](../Day-17-Date-Time-API)

---
*🤖 Auto-generated note*
