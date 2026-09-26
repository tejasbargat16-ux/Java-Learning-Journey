public class Employee {
    String name;
    String designation;
    double salary;

    Employee(String name, String designation, double salary) {

        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: ₹" + salary);
    }
}
