import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class PracticeSolutions {
    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        // Problem 1: Find names of employees in "Pune" with salary > 60000, sorted alphabetically
        List<String> p1 = emps.stream()
                .filter(e -> e.getCity().equals("Pune") && e.getSalary() > 60000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("P1 (Pune & salary > 60k): " + p1);

        // Problem 2: Count the number of employees per city
        Map<String, Long> p2 = emps.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        TreeMap::new, Collectors.counting()));
        System.out.println("P2 (Count per city): " + p2);

        // Problem 3: Find the department with the highest total salary expenditure
        Map<String, Double> totals = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        totals.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(en -> System.out.println("P3 (Highest salary dept): " + en.getKey() + " -> " + en.getValue()));

        // Problem 4: Word frequency count in a sentence using streams
        String sentence = "java is fun and java is powerful";
        Map<String, Long> p4 = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),
                        TreeMap::new, Collectors.counting()));
        System.out.println("P4 (Word frequency): " + p4);

        // Problem 5: Partition numbers 1-10 into even/odd and sum each partition
        Map<Boolean, Integer> p5 = IntStream.rangeClosed(1, 10).boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0,
                        Collectors.summingInt(n -> n)));
        System.out.println("P5 (Sum even/odd): " + p5);
    }
}