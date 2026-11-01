import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {

        Instant currentTimestamp = Instant.now();

        System.out.println(
                "Current UTC Timestamp: " +
                currentTimestamp
        );

        System.out.println(
                "Epoch Seconds: " +
                currentTimestamp.getEpochSecond()
        );

        Instant futureTimestamp =
                currentTimestamp.plusSeconds(3600);

        System.out.println(
                "After One Hour: " +
                futureTimestamp
        );
    }
}
