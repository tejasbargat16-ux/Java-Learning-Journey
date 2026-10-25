public class ShapeCalculator {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new RectangleShape(10, 4),
            new Circle(2)
        };

        for (Shape shape : shapes) {
            System.out.printf(
                    "Area: %.2f%n",
                    shape.area()
            );
        }
    }
}
