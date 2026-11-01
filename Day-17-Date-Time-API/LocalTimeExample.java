import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime collegeTime =
                LocalTime.of(10, 0);

        System.out.println(
                "Current Time: " + currentTime
        );

        System.out.println(
                "College Starts: " + collegeTime
        );

        System.out.println(
                "Hour: " + currentTime.getHour()
        );

        System.out.println(
                "Minute: " + currentTime.getMinute()
        );

        System.out.println(
                "After 2 Hours: " +
                currentTime.plusHours(2)
        );
    }
}
