public class ShapeDemo {

    public static void main(String[] args) {

        Shape shape = new Circle(5);

        shape.displayName();

        System.out.printf(
                "Area: %.2f%n",
                shape.calculateArea());
    }
}