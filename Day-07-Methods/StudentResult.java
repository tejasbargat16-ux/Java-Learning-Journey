import java.util.Scanner;

public class StudentResult {

    static int calculateTotal(int[] marks) {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    static char calculateGrade(double percentage) {

        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter marks for subject "
                    + (i + 1) + ": ");

            marks[i] = scanner.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);
        double percentage = (total / 500.0) * 100;
        char grade = calculateGrade(percentage);

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total: " + total + "/500");
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("==========================");

        scanner.close();
    }
}
