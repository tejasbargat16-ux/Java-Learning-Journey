public class Students {

    String name;
    int age;
    String branch;

    Students(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}
