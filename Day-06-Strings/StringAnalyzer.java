import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String lowerText = text.toLowerCase();

        // Length
        int length = text.length();

        // Reverse
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        // Vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < lowerText.length(); i++) {

            char ch = lowerText.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u') {

                    vowels++;

                } else {
                    consonants++;
                }
            }
        }

        System.out.println("\n===== STRING ANALYZER =====");
        System.out.println("Original: " + text);
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + lowerText);
        System.out.println("Reverse: " + reverse);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        System.out.println("===========================");

        scanner.close();
    }
}
