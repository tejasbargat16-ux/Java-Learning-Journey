import java.util.ArrayList;

public class GenericListExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        String language = languages.get(0);

        System.out.println("First language: " + language);
        System.out.println("All languages: " + languages);
    }
}