import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");

            int age = scanner.nextInt();

            if (age <= 0 || age > 120) {
                System.out.println("Age is out of range.");
            } else {
                System.out.println("Your age: " + age);
            }

        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input. Enter a whole number."
            );

        } finally {

            scanner.close();
        }
    }
}
