import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalTime start =
                LocalTime.of(10, 0);

        LocalTime end =
                LocalTime.of(12, 30);

        Duration duration =
                Duration.between(start, end);

        System.out.println(
                "Hours: " + duration.toHours()
        );

        System.out.println(
                "Minutes: " + duration.toMinutes()
        );

        System.out.println(
                "Seconds: " + duration.toSeconds()
        );
    }
}
