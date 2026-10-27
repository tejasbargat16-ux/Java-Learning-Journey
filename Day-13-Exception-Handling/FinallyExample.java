public class FinallyExample {
    public static void main(String[] args) {

        try {
            int result = 20 / 5;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");

        } finally {
            System.out.println(
                    "Finally block executed."
            );
        }
    }
}
