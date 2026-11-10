import java.util.*;
import java.util.stream.*;

public class StudentAnalyticsApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1,  "Aditi",     "ECE",  92),
            new Student(2,  "Bhavesh",   "CSE",  78),
            new Student(3,  "Chaitanya", "ECE",  67),
            new Student(4,  "Disha",     "CSE",  85),
            new Student(5,  "Eshan",     "MECH", 38),
            new Student(6,  "Farhan",    "ECE",  74),
            new Student(7,  "Gauri",     "CSE",  91),
            new Student(8,  "Harsh",     "MECH", 55),
            new Student(9,  "Isha",      "ECE",  49),
            new Student(10, "Jay",       "CSE",  63),
            new Student(11, "Kriti",     "MECH", 82),
            new Student(12, "Lavesh",    "ECE",  35)
        );

        System.out.println("===== STUDENT RESULT ANALYTICS =====");

        IntSummaryStatistics stats = students.stream()
                .mapToInt(Student::getMarks).summaryStatistics();
        System.out.println("Total students : " + stats.getCount());
        System.out.printf("Average marks  : %.2f%n", stats.getAverage());
        System.out.println("Highest marks  : " + stats.getMax());
        System.out.println("Lowest marks   : " + stats.getMin());

        Map<Boolean, Long> passFail = students.stream()
                .collect(Collectors.partitioningBy(Student::isPass, Collectors.counting()));
        System.out.println("\nPassed : " + passFail.get(true));
        System.out.println("Failed : " + passFail.get(false));

        List<String> failed = students.stream()
                .filter(s -> !s.isPass()).map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Failed students: " + failed);

        System.out.println("\n--- Branch-wise Average ---");
        Map<String, Double> branchAvg = students.stream()
                .collect(Collectors.groupingBy(Student::getBranch,
                        TreeMap::new, Collectors.averagingInt(Student::getMarks)));
        branchAvg.forEach((b, a) -> System.out.printf("%-5s : %.2f%n", b, a));

        System.out.println("\n--- Grade Distribution ---");
        Map<String, Long> dist = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade,
                        TreeMap::new, Collectors.counting()));
        System.out.println(dist);

        System.out.println("\n--- Students by Grade ---");
        Map<String, String> byGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, TreeMap::new,
                        Collectors.mapping(Student::getName, Collectors.joining(", "))));
        byGrade.forEach((g, n) -> System.out.println("Grade " + g + " : " + n));

        System.out.println("\n--- Branch Toppers ---");
        Map<String, Student> toppers = students.stream()
                .collect(Collectors.groupingBy(Student::getBranch, TreeMap::new,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::getMarks)),
                                opt -> opt.orElse(null))));
        toppers.forEach((b, s) -> System.out.println(b + " topper : " + s));

        System.out.println("\n--- Top 3 Students ---");
        List<Student> top3 = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .limit(3).collect(Collectors.toList());
        for (int i = 0; i < top3.size(); i++) {
            System.out.println((i + 1) + ". " + top3.get(i));
        }
    }
}