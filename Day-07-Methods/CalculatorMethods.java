import java.util.Scanner;

public class CalculatorMethods {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {

        if (b == 0) {
            return 0;
        }

        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.println("\n===== CALCULATOR =====");
        System.out.println("Addition: " + add(first, second));
        System.out.println("Subtraction: " + subtract(first, second));
        System.out.println("Multiplication: " + multiply(first, second));

        if (second != 0) {
            System.out.println("Division: " + divide(first, second));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }
}
