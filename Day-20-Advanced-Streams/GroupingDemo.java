import java.util.*;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        System.out.println("1. Group by department:");
        Map<String, List<Employee>> byDept = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        TreeMap::new, Collectors.toList()));
        byDept.forEach((d, list) -> System.out.println("   " + d + " -> " + list));

        Map<String, Long> countByDept = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        TreeMap::new, Collectors.counting()));
        System.out.println("2. Count per dept: " + countByDept);

        Map<String, Double> avgByDept = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        TreeMap::new, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("3. Avg salary per dept: " + avgByDept);

        Map<String, List<String>> namesByDept = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("4. Names per dept: " + namesByDept);

        Map<String, Map<String, Long>> deptCity = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new,
                        Collectors.groupingBy(Employee::getCity, TreeMap::new,
                                Collectors.counting())));
        System.out.println("5. Dept -> City -> Count: " + deptCity);

        Map<String, Employee> topPerDept = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                opt -> opt.orElse(null))));
        System.out.println("6. Highest paid per dept: " + topPerDept);

        Map<Boolean, List<Employee>> part = emps.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() >= 60000));
        System.out.println("7. Partition (salary >= 60000):");
        System.out.println("   " + part);

        Map<Boolean, Long> partCount = emps.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() >= 60000,
                        Collectors.counting()));
        System.out.println("8. Partition counts: " + partCount);
    }
}