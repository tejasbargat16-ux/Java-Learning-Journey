import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter Mathematics marks: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter English marks: ");
        double english = scanner.nextDouble();

        System.out.print("Enter Computer marks: ");
        double computer = scanner.nextDouble();

        double total = physics + chemistry + mathematics + english + computer;
        double average = total / 5;
        double percentage = (total / 500) * 100;

        System.out.println("\n===== MARKS REPORT =====");
        System.out.println("Total: " + total + "/500");
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
