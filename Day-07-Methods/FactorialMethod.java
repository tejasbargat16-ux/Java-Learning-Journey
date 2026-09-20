import java.util.Scanner;

public class FactorialMethod {

    static long factorial(int number) {

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial: " + factorial(number));

        scanner.close();
    }
}
