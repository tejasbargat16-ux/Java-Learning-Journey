public class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {

        this.name = name;
        this.employeeId = employeeId;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
