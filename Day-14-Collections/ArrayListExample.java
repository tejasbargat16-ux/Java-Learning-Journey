import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");

        System.out.println("Languages: " + languages);
        System.out.println("First: " + languages.get(0));

        languages.set(1, "C++");
        System.out.println("After update: " + languages);

        languages.remove("JavaScript");
        System.out.println("After removal: " + languages);

        System.out.println("Size: " + languages.size());
    }
}