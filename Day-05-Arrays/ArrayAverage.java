import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
