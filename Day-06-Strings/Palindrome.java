import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }
}
