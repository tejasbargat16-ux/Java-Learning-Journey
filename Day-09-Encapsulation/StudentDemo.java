public class StudentDemo {

    public static void main(String[] args) {

        Student student =
                new Student("Tejas", 20, "ECE");

        student.displayDetails();

        student.setName("Tejas Bargat");
        student.setAge(21);
        student.setBranch("Computer Engineering");

        System.out.println("\nAfter Update:");

        student.displayDetails();
    }
}
