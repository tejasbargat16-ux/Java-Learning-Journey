import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

        scanner.close();
    }
}
