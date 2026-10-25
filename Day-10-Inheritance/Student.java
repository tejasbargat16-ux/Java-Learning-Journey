public class Student extends Person {
    String branch;

    Student(String name, int age, String branch) {
        super(name, age);
        this.branch = branch;
    }

    void displayStudent() {
        super.displayDetails();
        System.out.println("Branch: " + branch);
    }
}
