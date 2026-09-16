import java.util.Scanner;

public class ArrayAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum += numbers[i];

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("\n===== ARRAY ANALYZER =====");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
        System.out.println("==========================");

        scanner.close();
    }
}
