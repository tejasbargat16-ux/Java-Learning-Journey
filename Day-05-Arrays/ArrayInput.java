import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nArray elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
