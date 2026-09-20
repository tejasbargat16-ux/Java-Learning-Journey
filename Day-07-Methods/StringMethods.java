import java.util.Scanner;

public class StringMethods {

    static int countCharacters(String text) {
        return text.length();
    }

    static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean isPalindrome(String text) {

        String reversed = reverse(text);

        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Characters: " + countCharacters(text));
        System.out.println("Reverse: " + reverse(text));

        if (isPalindrome(text)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        scanner.close();
    }
}
