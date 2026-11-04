import java.util.ArrayList;
import java.util.Collections;

public class MarksSorter {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(92);
        marks.add(68);
        marks.add(85);
        marks.add(80);

        Collections.sort(marks);

        System.out.println("Sorted marks: " + marks);
        System.out.println("Lowest: " + Collections.min(marks));
        System.out.println("Highest: " + Collections.max(marks));
    }
}