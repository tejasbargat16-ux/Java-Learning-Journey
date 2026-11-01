import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MeetingScheduler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm"
                );

        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern(
                        "dd MMMM yyyy, hh:mm a"
                );

        try {

            System.out.print(
                    "Enter meeting date and time: "
            );

            LocalDateTime meeting =
                    LocalDateTime.parse(
                            scanner.nextLine(),
                            inputFormatter
                    );

            System.out.println(
                    "Meeting: " +
                    meeting.format(outputFormatter)
            );

            System.out.println(
                    "Day: " + meeting.getDayOfWeek()
            );

        } catch (DateTimeParseException e) {

            System.out.println(
                    "Invalid input. Use dd-MM-yyyy HH:mm."
            );

        } finally {

            scanner.close();
        }
    }
}
