public class ConstructorExample {
    String name;
    int age;

    ConstructorExample() {

        name = "Tejas";
        age = 20;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorExample student = new ConstructorExample();

        student.display();
    }
}
