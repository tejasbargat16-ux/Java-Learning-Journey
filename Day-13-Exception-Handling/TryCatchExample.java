public class TryCatchExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Cannot divide by zero."
            );
        }
        System.out.println("Program continues.");
    }
}
