class PersonPractice {

    String name;
    int age;

    PersonPractice(String name, int age) {

        this.name = name;
        this.age = age;
    }
}

public class TeacherPractice extends PersonPractice {
    String subject;

    TeacherPractice(
            String name,
            int age,
            String subject) {

        super(name, age);

        this.subject = subject;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {

        TeacherPractice teacher =
                new TeacherPractice(
                        "Amit",
                        35,
                        "Java"
                );

        teacher.displayDetails();
    }
}
