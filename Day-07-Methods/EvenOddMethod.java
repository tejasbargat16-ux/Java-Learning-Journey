import java.util.Scanner;

public class EvenOddMethod {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
        scanner.close();
    }
}
