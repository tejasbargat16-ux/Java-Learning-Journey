import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine().toLowerCase();

        System.out.print("Enter character to search: ");
        char target = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency: " + count);

        scanner.close();
    }
}
