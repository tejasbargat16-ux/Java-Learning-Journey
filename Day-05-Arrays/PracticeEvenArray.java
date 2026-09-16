import java.util.Scanner;

public class PracticeEvenArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nEven numbers:");

        for (int number : numbers) {

            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}
