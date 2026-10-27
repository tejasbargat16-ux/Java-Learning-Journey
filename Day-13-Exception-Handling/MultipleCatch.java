public class MultipleCatch {
    public static void main(String[] args) {

        try {
            String text = "abc";
            int number = Integer.parseInt(text);

            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Invalid number format."
            );

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Arithmetic operation failed."
            );
        }
        System.out.println("Program finished.");
    }
}
