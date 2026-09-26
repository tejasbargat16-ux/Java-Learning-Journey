public class Employee {

    private String name;
    private String designation;
    private double salary;

    public Employee(
            String name,
            String designation,
            double salary) {

        this.name = name;
        this.designation = designation;

        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println(
                    "Salary cannot be negative."
            );
        }
    }

    public void displayDetails() {

        System.out.println("\n===== EMPLOYEE =====");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: ₹" + salary);
    }
}
