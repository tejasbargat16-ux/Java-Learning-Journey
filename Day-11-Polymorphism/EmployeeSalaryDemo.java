class EmployeeSalary {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends EmployeeSalary {

    private double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends EmployeeSalary {

    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        EmployeeSalary[] employees = {
            new FullTimeEmployee(30000),
            new PartTimeEmployee(80, 200)
        };

        for (EmployeeSalary employee : employees) {
            System.out.println(
                    "Salary: ₹" + employee.calculateSalary()
            );
        }
    }
}
