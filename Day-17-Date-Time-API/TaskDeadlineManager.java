import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TaskDeadlineManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {

            System.out.print("Enter task name: ");
            String taskName = scanner.nextLine();

            if (taskName.isBlank()) {
                System.out.println("Task name is required.");
                return;
            }

            System.out.print(
                    "Enter deadline (dd-MM-yyyy): "
            );

            String input = scanner.nextLine();

            LocalDate deadline =
                    LocalDate.parse(input, formatter);

            LocalDate today = LocalDate.now();

            System.out.println("\n===== TASK DETAILS =====");

            System.out.println("Task: " + taskName);

            System.out.println(
                    "Today: " + today.format(formatter)
            );

            System.out.println(
                    "Deadline: " + deadline.format(formatter)
            );

            if (deadline.isBefore(today)) {

                Period overdue =
                        Period.between(deadline, today);

                System.out.println("Status: OVERDUE");

                System.out.println(
                        "Overdue by: " +
                        overdue.getDays() + " days"
                );

            } else if (deadline.isEqual(today)) {

                System.out.println("Status: DUE TODAY");

            } else {

                long remainingDays =
                        java.time.temporal.ChronoUnit.DAYS
                                .between(today, deadline);

                System.out.println("Status: UPCOMING");

                System.out.println(
                        "Remaining Days: " + remainingDays
                );
            }

            System.out.println("========================");

        } catch (DateTimeParseException e) {

            System.out.println(
                    "Invalid date. Use dd-MM-yyyy."
            );

        } finally {

            scanner.close();
        }
    }
}
