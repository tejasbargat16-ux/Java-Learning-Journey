import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Length: " + word.length());

        scanner.close();
    }
}
