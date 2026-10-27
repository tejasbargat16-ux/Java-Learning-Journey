public class ThrowExample {
    static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException(
                    "Age must be at least 18."
            );
        }
        System.out.println("Age accepted.");
    }

    public static void main(String[] args) {
        try {

            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Validation error: " + e.getMessage()
            );
        }
    }
}
