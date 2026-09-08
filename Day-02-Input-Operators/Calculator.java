import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("\n===== RESULT =====");

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Division: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}
