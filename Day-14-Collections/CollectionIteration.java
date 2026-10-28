import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionIteration {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Mathematics");
        subjects.add("Electronics");

        System.out.println("=== SUBJECTS ===");

        for (String subject : subjects) {
            System.out.println(subject);
        }

        HashSet<String> cities = new HashSet<>();

        cities.add("Nagpur");
        cities.add("Pune");
        cities.add("Mumbai");

        System.out.println("\n=== CITIES ===");

        for (String city : cities) {
            System.out.println(city);
        }

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Tejas");
        students.put(102, "Rahul");

        System.out.println("\n=== STUDENTS ===");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                            entry.getValue());
        }
    }
}