import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime meeting =
                LocalDateTime.of(2026, 11, 5, 14, 30);

        System.out.println("Current: " + now);
        System.out.println("Meeting: " + meeting);

        System.out.println(
                "Tomorrow: " + now.plusDays(1)
        );

        System.out.println(
                "After 3 Hours: " + now.plusHours(3)
        );
    }
}
