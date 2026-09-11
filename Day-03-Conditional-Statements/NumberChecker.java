import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive number.");
        } else if (number < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
