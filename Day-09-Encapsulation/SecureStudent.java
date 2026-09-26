import java.util.Scanner;

public class SecureStudent {
    private String name;
    private int age;
    private double percentage;

    public void setName(String name) {

        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setPercentage(double percentage) {

        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println(
                    "Percentage must be between 0 and 100."
            );
        }
    }

    public double getPercentage() {
        return percentage;
    }

    public void display() {

        System.out.println("\n===== SECURE STUDENT =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SecureStudent student =
                new SecureStudent();

        System.out.print("Enter name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter age: ");
        student.setAge(scanner.nextInt());

        System.out.print("Enter percentage: ");
        student.setPercentage(scanner.nextDouble());

        student.display();

        scanner.close();
    }
}
