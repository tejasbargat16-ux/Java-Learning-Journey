public class Developer extends Employee {
    private String programmingLanguage;

    Developer(
            String name,
            int employeeId,
            String programmingLanguage) {

        super(name, employeeId);

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {

        super.displayDetails();

        System.out.println(
                "Programming Language: " +
                programmingLanguage
        );
    }

    void writeCode() {

        System.out.println(
                name + " is writing " +
                programmingLanguage + " code."
        );
    }
}
