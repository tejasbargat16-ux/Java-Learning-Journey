import java.util.HashMap;
import java.util.Map;

public class MarksLookup {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Tejas", 85);
        marks.put("Rahul", 78);
        marks.put("Priya", 92);

        String searchName = "Tejas";

        if (marks.containsKey(searchName)) {
            System.out.println(
                    searchName + "'s marks: " +
                            marks.get(searchName));
        } else {
            System.out.println("Student not found.");
        }

        int total = 0;

        for (int mark : marks.values()) {
            total += mark;
        }

        double average = (double) total / marks.size();

        System.out.printf("Average marks: %.2f%n", average);
    }
}