import java.util.Scanner;

public class StudentManagement {

    String name;
    int age;
    String branch;
    double percentage;

    StudentManagement(
            String name,
            int age,
            String branch,
            double percentage) {

        this.name = name;
        this.age = age;
        this.branch = branch;
        this.percentage = percentage;
    }

    void displayStudent() {

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Percentage: " + percentage);
        System.out.println("===========================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        StudentManagement student =
                new StudentManagement(
                        name,
                        age,
                        branch,
                        percentage
                );

        student.displayStudent();

        scanner.close();
    }
}
