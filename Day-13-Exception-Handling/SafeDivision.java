public class SafeDivision {
    static double divide(double a, double b) {

        if (b == 0) {
            throw new IllegalArgumentException(
                    "Divisor cannot be zero."
            );
        }

        return a / b;
    }

    public static void main(String[] args) {
        try {

            System.out.println(divide(20, 4));
            System.out.println(divide(20, 0));

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}
