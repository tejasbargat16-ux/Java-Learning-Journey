public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee =
                new Employee(
                        "Tejas",
                        "Software Developer",
                        50000
                );
        employee.displayDetails();
        employee.setSalary(60000);
        System.out.println("\nAfter Salary Update:");
        employee.displayDetails();
    }
}
