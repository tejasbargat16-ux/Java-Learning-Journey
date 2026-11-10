import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getAll() {
        return Arrays.asList(
            new Employee(1,  "Aarav",  "IT",      "Pune",   60000, 28),
            new Employee(2,  "Diya",   "IT",      "Mumbai", 75000, 32),
            new Employee(3,  "Rohan",  "HR",      "Pune",   45000, 26),
            new Employee(4,  "Sneha",  "Finance", "Nagpur", 55000, 30),
            new Employee(5,  "Kabir",  "IT",      "Nagpur", 90000, 35),
            new Employee(6,  "Meera",  "HR",      "Mumbai", 50000, 29),
            new Employee(7,  "Vikram", "Finance", "Pune",   65000, 41),
            new Employee(8,  "Anaya",  "IT",      "Pune",   82000, 27),
            new Employee(9,  "Ishaan", "Sales",   "Mumbai", 40000, 24),
            new Employee(10, "Tanvi",  "Sales",   "Nagpur", 48000, 31)
        );
    }
}