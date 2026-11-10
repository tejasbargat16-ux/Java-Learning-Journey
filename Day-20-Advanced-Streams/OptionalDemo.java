import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    static Optional<Employee> findById(List<Employee> list, int id) {
        return list.stream().filter(e -> e.getId() == id).findFirst();
    }

    static Optional<String> getEmail(Employee e) {
        return e.getName().equals("Kabir")
                ? Optional.of("kabir@company.com")
                : Optional.empty();
    }

    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        Optional<Employee> found = findById(emps, 5);
        Optional<Employee> missing = findById(emps, 99);

        System.out.println("1. found.isPresent()   : " + found.isPresent());
        System.out.println("2. missing.isPresent() : " + missing.isPresent());

        found.ifPresent(e -> System.out.println("3. ifPresent            : " + e.getName()));

        System.out.println("4. orElse              : "
                + missing.map(Employee::getName).orElse("Unknown"));
        System.out.println("5. orElseGet           : "
                + missing.map(Employee::getName).orElseGet(() -> "Guest-99"));
        System.out.println("6. map city            : "
                + found.map(Employee::getCity).orElse("N/A"));

        System.out.println("7. filter (>80000)     : "
                + found.filter(e -> e.getSalary() > 80000).isPresent());
        System.out.println("8. filter (>100000)    : "
                + found.filter(e -> e.getSalary() > 100000).isPresent());

        String nothing = null;
        System.out.println("9. ofNullable(null)    : " + Optional.ofNullable(nothing));
        System.out.println("10. Optional.of(\"Java\") : " + Optional.of("Java"));

        System.out.println("11. flatMap (found)    : " + found.flatMap(OptionalDemo::getEmail));
        System.out.println("12. flatMap (missing)  : " + missing.flatMap(OptionalDemo::getEmail));

        try {
            missing.orElseThrow(() -> new IllegalArgumentException("Employee 99 not found"));
        } catch (IllegalArgumentException ex) {
            System.out.println("13. Caught             : " + ex.getMessage());
        }
    }
}