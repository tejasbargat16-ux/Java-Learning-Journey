import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Tejas");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println("Students: " + students);
        System.out.println("Student 101: " +
                students.get(101));

        // Update the value for key 102
        students.put(102, "Amit");

        System.out.println("After update: " + students);

        System.out.println("Contains ID 103: " +
                students.containsKey(103));

        students.remove(103);

        System.out.println("After removal: " + students);
    }
}