public class Student {
    private String name;
    private int age;
    private String branch;

    public Student(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void displayDetails() {

        System.out.println("\n===== STUDENT =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}
