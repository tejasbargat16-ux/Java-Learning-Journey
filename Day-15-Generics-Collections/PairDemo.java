public class PairDemo {

    public static void main(String[] args) {

        Pair<Integer, String> student =
                new Pair<>(101, "Tejas");

        Pair<String, Double> product =
                new Pair<>("Keyboard", 1200.0);

        System.out.println(
                student.getKey() + " -> " +
                student.getValue()
        );

        System.out.println(
                product.getKey() + " -> ₹" +
                product.getValue()
        );
    }
}