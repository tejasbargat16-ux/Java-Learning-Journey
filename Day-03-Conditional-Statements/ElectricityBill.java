import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        double units = scanner.nextDouble();

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: ₹" + bill);

        scanner.close();
    }
}
