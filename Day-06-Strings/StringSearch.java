import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to search: ");
        String word = scanner.nextLine();

        if (sentence.contains(word)) {
            System.out.println("Word found.");
        } else {
            System.out.println("Word not found.");
        }

        scanner.close();
    }
}
