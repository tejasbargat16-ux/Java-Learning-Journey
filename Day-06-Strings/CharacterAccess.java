import java.util.Scanner;

public class CharacterAccess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));

        scanner.close();
    }
}
