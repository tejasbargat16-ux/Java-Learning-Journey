import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Original number save kar rahe hain
        int originalNumber = number;

        // 1. Count digits
        int temp = number;
        int digitCount = 0;

        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                digitCount++;
            }
        }

        // 2. Reverse number
        temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        // 3. Even or Odd
        String evenOdd;

        if (number % 2 == 0) {
            evenOdd = "Even";
        } else {
            evenOdd = "Odd";
        }

        // 4. Prime check
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Final Result
        System.out.println("\n===== NUMBER ANALYZER =====");
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Reverse: " + reverse);
        System.out.println("Type: " + evenOdd);

        if (isPrime) {
            System.out.println("Prime: Yes");
        } else {
            System.out.println("Prime: No");
        }

        System.out.println("===========================");

        scanner.close();
    }
}
