import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
