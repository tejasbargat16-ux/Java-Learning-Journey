import java.util.HashSet;

public class UniqueSkills {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("Git");
        skills.add("Java");

        System.out.println("Unique skills:");

        for (String skill : skills) {
            System.out.println(skill);
        }

        System.out.println(
                "Unique count: " + skills.size());
    }
}