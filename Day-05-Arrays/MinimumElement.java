import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum element: " + minimum);

        scanner.close();
    }
}
