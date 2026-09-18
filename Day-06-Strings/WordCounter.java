import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {

            String[] words = sentence.split("\\s+");

            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}
