import java.util.Scanner;

public class LoginChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "tejas";
        String correctPassword = "java123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) &&
            password.equals(correctPassword)) {

            System.out.println("Login successful!");

        } else {

            System.out.println("Invalid username or password.");

        }

        scanner.close();
    }
}
