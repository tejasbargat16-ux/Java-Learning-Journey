public class BoundedGenericDemo {

    public static <T extends Number> double sum(
            T first, T second) {

        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(5.5, 2.5));
        System.out.println(sum(10, 2.5));
    }
}