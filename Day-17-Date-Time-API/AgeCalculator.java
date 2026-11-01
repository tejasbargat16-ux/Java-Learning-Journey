import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {

            System.out.print("Enter date of birth: ");

            LocalDate birthDate =
                    LocalDate.parse(
                            scanner.nextLine(),
                            formatter
                    );

            LocalDate today = LocalDate.now();

            if (birthDate.isAfter(today)) {

                System.out.println(
                        "Date of birth cannot be in the future."
                );

            } else {

                Period age =
                        Period.between(birthDate, today);

                System.out.println(
                        "Age: " + age.getYears() + " years"
                );
            }

        } catch (java.time.format.DateTimeParseException e) {

            System.out.println("Invalid date format.");

        } finally {

            scanner.close();
        }
    }
}
