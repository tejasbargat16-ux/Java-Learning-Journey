public class GenericMaximum {

    public static <T extends Comparable<T>> T maximum(
            T first, T second) {

        if (first.compareTo(second) >= 0) {
            return first;
        }

        return second;
    }

    public static void main(String[] args) {

        System.out.println(maximum(10, 25));
        System.out.println(maximum("Java", "Python"));
        System.out.println(maximum(4.5, 2.8));
    }
}