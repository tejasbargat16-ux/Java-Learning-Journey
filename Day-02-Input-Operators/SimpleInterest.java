import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n===== SIMPLE INTEREST =====");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
