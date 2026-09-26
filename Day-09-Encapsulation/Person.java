public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Tejas");
        person.setAge(20);

        System.out.println(
                "Name: " + person.getName()
        );

        System.out.println(
                "Age: " + person.getAge()
        );
    }
}
