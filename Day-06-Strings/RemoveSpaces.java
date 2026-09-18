import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = sentence.replace(" ", "");

        System.out.println("Original: " + sentence);
        System.out.println("Without spaces: " + result);

        scanner.close();
    }
}
