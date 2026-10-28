abstract class PayrollEmployee {

    abstract double calculateSalary();
}

class FullTimeEmployee extends PayrollEmployee {

    private double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends PayrollEmployee {

    private int hours;
    private double hourlyRate;

    PartTimeEmployee(int hours, double hourlyRate) {
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class PayrollDemo {

    public static void main(String[] args) {

        PayrollEmployee[] employees = {
            new FullTimeEmployee(30000),
            new PartTimeEmployee(80, 200)
        };

        for (PayrollEmployee employee : employees) {
            System.out.println(
                    "Salary: ₹" + employee.calculateSalary()
            );
        }
    }
}