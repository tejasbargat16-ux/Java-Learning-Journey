import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateParsing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {

            System.out.print("Enter date (dd-MM-yyyy): ");

            String input = scanner.nextLine();

            LocalDate date =
                    LocalDate.parse(input, formatter);

            System.out.println("Parsed Date: " + date);

            System.out.println(
                    "Formatted Date: " +
                    date.format(formatter)
            );

        } catch (java.time.format.DateTimeParseException e) {

            System.out.println(
                    "Invalid date format. Please use dd-MM-yyyy."
            );

        } finally {

            scanner.close();
        }
    }
}
