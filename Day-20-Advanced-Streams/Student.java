public class Student {
    private final int id;
    private final String name;
    private final String branch;
    private final int marks;

    public Student(int id, String name, String branch, int marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getBranch() { return branch; }
    public int getMarks() { return marks; }

    public boolean isPass() { return marks >= 40; }

    public String getGrade() {
        if (marks >= 85) return "A";
        if (marks >= 70) return "B";
        if (marks >= 55) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    @Override
    public String toString() {
        return name + " (" + branch + ", " + marks + ")";
    }
}