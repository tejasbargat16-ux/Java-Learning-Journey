import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        scanner.close();
    }
}

