import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        System.out.println(
                "Minimum: " + Collections.min(numbers)
        );

        System.out.println(
                "Maximum: " + Collections.max(numbers)
        );
    }
}