import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExamCountdown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {

            System.out.print("Enter exam date: ");

            LocalDate examDate =
                    LocalDate.parse(
                            scanner.nextLine(),
                            formatter
                    );

            LocalDate today = LocalDate.now();

            if (examDate.isBefore(today)) {

                System.out.println(
                        "Exam date has passed."
                );

            } else if (examDate.isEqual(today)) {

                System.out.println("Exam is today!");

            } else {

                long days = ChronoUnit.DAYS.between(
                        today, examDate
                );

                System.out.println(
                        "Days remaining: " + days
                );
            }

        } catch (DateTimeParseException e) {

            System.out.println("Invalid date format.");

        } finally {

            scanner.close();
        }
    }
}
