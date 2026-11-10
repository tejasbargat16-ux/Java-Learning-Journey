import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        List<String> names = emps.stream()
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println("1. toList: " + names);

        Set<String> depts = emps.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("2. toCollection(TreeSet): " + depts);

        Map<Integer, String> idToName = emps.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println("3. toMap: " + idToName);

        Map<String, Double> deptTotal = emps.stream()
                .collect(Collectors.toMap(Employee::getDepartment,
                        Employee::getSalary, Double::sum, TreeMap::new));
        System.out.println("4. toMap + merge: " + deptTotal);

        String joined = emps.stream().map(Employee::getName).limit(4)
                .collect(Collectors.joining(" | ", "<", ">"));
        System.out.println("5. joining: " + joined);

        long count = emps.stream().collect(Collectors.counting());
        double total = emps.stream().collect(Collectors.summingDouble(Employee::getSalary));
        double avg = emps.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("6. counting: " + count);
        System.out.printf("7. summingDouble: %.2f%n", total);
        System.out.printf("8. averagingDouble: %.2f%n", avg);

        DoubleSummaryStatistics st = emps.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.printf("9. stats: min=%.0f max=%.0f avg=%.0f sum=%.0f count=%d%n",
                st.getMin(), st.getMax(), st.getAverage(), st.getSum(), st.getCount());

        emps.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
            .ifPresent(e -> System.out.println("10. maxBy: " + e));
        emps.stream()
            .collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)))
            .ifPresent(e -> System.out.println("11. minBy: " + e));

        Set<String> cities = emps.stream()
                .collect(Collectors.mapping(Employee::getCity,
                        Collectors.toCollection(TreeSet::new)));
        System.out.println("12. mapping cities: " + cities);

        try {
            emps.stream().collect(
                    Collectors.toMap(Employee::getDepartment, Employee::getName));
        } catch (IllegalStateException ex) {
            System.out.println("13. Duplicate key -> " + ex.getClass().getSimpleName());
        }
    }
}