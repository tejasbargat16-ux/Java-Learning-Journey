import java.util.Scanner;

public class PracticeResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        scanner.close();
    }
}
