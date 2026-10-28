public class Student {

    private final int id;
    private String name;
    private double percentage;

    public Student(int id, String name, double percentage) {

        if (id <= 0) {
            throw new IllegalArgumentException(
                    "Student ID must be positive.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Student name is required.");
        }

        if (!Double.isFinite(percentage)
                || percentage < 0
                || percentage > 100) {
            throw new IllegalArgumentException(
                    "Percentage must be between 0 and 100.");
        }

        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void updateDetails(String name, double percentage) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Student name is required.");
        }

        if (!Double.isFinite(percentage)
                || percentage < 0
                || percentage > 100) {
            throw new IllegalArgumentException(
                    "Percentage must be between 0 and 100.");
        }

        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {

        return "ID: " + id
                + ", Name: " + name
                + ", Percentage: " + percentage + "%";
    }
}