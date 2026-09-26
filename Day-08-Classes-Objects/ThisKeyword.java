public class ThisKeyword {

    String name;
    int age;

    ThisKeyword(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        ThisKeyword student =
                new ThisKeyword("Tejas", 20);

        student.display();
    }
}
