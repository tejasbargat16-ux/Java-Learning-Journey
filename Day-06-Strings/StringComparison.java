import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = scanner.nextLine();

        System.out.print("Enter second word: ");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are different.");
        }

        if (first.equalsIgnoreCase(second)) {
            System.out.println("They are equal ignoring uppercase/lowercase.");
        }

        scanner.close();
    }
}
