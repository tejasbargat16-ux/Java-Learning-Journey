import java.util.ArrayList;
import java.util.Comparator;

class SortStudent {

    private final String name;
    private final double percentage;

    SortStudent(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + " - " + percentage + "%";
    }
}

public class StudentSorter {

    public static void main(String[] args) {

        ArrayList<SortStudent> students = new ArrayList<>();

        students.add(new SortStudent("Rahul", 78));
        students.add(new SortStudent("Tejas", 85));
        students.add(new SortStudent("Priya", 92));

        students.sort(
                Comparator.comparingDouble(
                        SortStudent::getPercentage
                ).reversed()
        );

        System.out.println("Students by percentage:");

        for (SortStudent student : students) {
            System.out.println(student);
        }
    }
}