import java.util.*;
import java.util.stream.*;

public class AdvancedStreamOps {
    public static void main(String[] args) {
        List<Employee> emps = EmployeeData.getAll();

        List<String> lines = Arrays.asList("java streams", "java optional", "collectors grouping");
        List<String> words = lines.stream()
                .flatMap(l -> Arrays.stream(l.split(" ")))
                .collect(Collectors.toList());
        System.out.println("1. flatMap : " + words);
        System.out.println("2. distinct: " + words.stream().distinct().collect(Collectors.toList()));

        List<Double> top3 = emps.stream().map(Employee::getSalary)
                .sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("3. Top 3 salaries: " + top3);

        List<Double> page2 = emps.stream().map(Employee::getSalary)
                .sorted(Comparator.reverseOrder()).skip(3).limit(3).collect(Collectors.toList());
        System.out.println("4. Page 2 (skip 3, limit 3): " + page2);

        List<String> sortedNames = emps.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary, Comparator.reverseOrder()))
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println("5. Dept asc, salary desc: " + sortedNames);

        int ageSum = emps.stream().map(Employee::getAge).reduce(0, Integer::sum);
        System.out.println("6. reduce (sum of ages): " + ageSum);
        Optional<Integer> maxAge = emps.stream().map(Employee::getAge).reduce(Integer::max);
        System.out.println("7. reduce (max age): " + maxAge);

        System.out.println("8. anyMatch(Nagpur)    : "
                + emps.stream().anyMatch(e -> e.getCity().equals("Nagpur")));
        System.out.println("   allMatch(sal>40000) : "
                + emps.stream().allMatch(e -> e.getSalary() > 40000));
        System.out.println("   noneMatch(age>50)   : "
                + emps.stream().noneMatch(e -> e.getAge() > 50));

        String firstHr = emps.stream().filter(e -> e.getDepartment().equals("HR"))
                .findFirst().map(Employee::toString).orElse("none");
        System.out.println("9. findFirst (HR): " + firstHr);

        IntSummaryStatistics ageStats = emps.stream()
                .mapToInt(Employee::getAge).summaryStatistics();
        System.out.println("10. " + ageStats);

        List<Integer> squares = IntStream.rangeClosed(1, 5)
                .map(n -> n * n).boxed().collect(Collectors.toList());
        System.out.println("11. Squares: " + squares);

        System.out.println("12. peek shows lazy order:");
        List<String> result = Stream.of("a", "bb", "ccc")
                .peek(x -> System.out.println("   Before filter: " + x))
                .filter(x -> x.length() > 1)
                .peek(x -> System.out.println("   After filter : " + x))
                .collect(Collectors.toList());
        System.out.println("   Result: " + result);

        Stream<String> once = Stream.of("x", "y");
        once.forEach(x -> { });
        try {
            once.forEach(x -> { });
        } catch (IllegalStateException ex) {
            System.out.println("13. Reuse error: " + ex.getMessage());
        }
    }
}