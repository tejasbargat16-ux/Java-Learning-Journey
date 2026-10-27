public class AgeValidation {
    private int age;
    public void setAge(int age) {

        if (age < 1 || age > 120) {
            throw new IllegalArgumentException(
                    "Age must be between 1 and 120."
            );
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        AgeValidation person = new AgeValidation();

        try {
            person.setAge(20);
            System.out.println(
                    "Accepted age: " + person.getAge()
            );
            person.setAge(150);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Validation error: " + e.getMessage()
            );
        }
    }
}
