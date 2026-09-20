public class LargestMethod {
    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Largest: " + largest(25, 70, 40));
    }
}
