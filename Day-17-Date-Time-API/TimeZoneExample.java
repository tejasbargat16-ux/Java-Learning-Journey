import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {

    public static void main(String[] args) {

        ZonedDateTime indiaTime =
                ZonedDateTime.now(
                        ZoneId.of("Asia/Kolkata")
                );

        ZonedDateTime londonTime =
                ZonedDateTime.now(
                        ZoneId.of("Europe/London")
                );

        ZonedDateTime tokyoTime =
                ZonedDateTime.now(
                        ZoneId.of("Asia/Tokyo")
                );

        System.out.println("India: " + indiaTime);
        System.out.println("London: " + londonTime);
        System.out.println("Tokyo: " + tokyoTime);
    }
}
