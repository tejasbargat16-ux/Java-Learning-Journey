import java.util.Scanner;

public class StudentInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);

        scanner.close();
    }
}
