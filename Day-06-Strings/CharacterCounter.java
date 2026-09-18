import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            count++;
        }

        System.out.println("Character count: " + count);

        scanner.close();
    }
}
