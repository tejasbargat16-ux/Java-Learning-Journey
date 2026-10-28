import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {

    private final HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {

        if (students.containsKey(student.getId())) {
            System.out.println("Student ID already exists.");
            return;
        }

        students.put(student.getId(), student);
        System.out.println("Student added successfully.");
    }

    public void searchStudent(int id) {

        Student student = students.get(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    public void updateStudent(
            int id, String name, double percentage) {

        Student student = students.get(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.updateDetails(name, percentage);
        System.out.println("Student updated successfully.");
    }

    public void removeStudent(int id) {

        if (students.remove(id) != null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {

            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagement manager = new StudentManagement();

        boolean running = true;

        while (running) {

            System.out.println("\n=== STUDENT MANAGEMENT ===");
            System.out.println("1. Add student");
            System.out.println("2. Search student");
            System.out.println("3. Update student");
            System.out.println("4. Remove student");
            System.out.println("5. Display all students");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            try {

                int choice = Integer.parseInt(
                        scanner.nextLine().trim());

                switch (choice) {

                    case 1: {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(
                                scanner.nextLine().trim());

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter percentage: ");
                        double percentage = Double.parseDouble(
                                scanner.nextLine().trim());

                        Student student = new Student(id, name, percentage);

                        manager.addStudent(student);
                        break;
                    }

                    case 2: {
                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(
                                scanner.nextLine().trim());

                        manager.searchStudent(id);
                        break;
                    }

                    case 3: {
                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(
                                scanner.nextLine().trim());

                        System.out.print("Enter new name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter new percentage: ");
                        double percentage = Double.parseDouble(
                                scanner.nextLine().trim());

                        manager.updateStudent(
                                id, name, percentage);
                        break;
                    }

                    case 4: {
                        System.out.print("Enter student ID: ");
                        int id = Integer.parseInt(
                                scanner.nextLine().trim());

                        manager.removeStudent(id);
                        break;
                    }

                    case 5:
                        manager.displayAllStudents();
                        break;

                    case 0:
                        running = false;
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid menu option.");
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Enter the correct number format.");

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "Validation error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}