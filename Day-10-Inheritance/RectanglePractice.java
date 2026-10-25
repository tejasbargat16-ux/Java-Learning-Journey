class ShapePractice {
    double area() {
        return 0;
    }
}

public class RectanglePractice extends ShapePractice {
    double length;
    double width;

    RectanglePractice(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {

        return length * width;
    }

    public static void main(String[] args) {
        RectanglePractice rectangle =
                new RectanglePractice(10, 5);

        System.out.println(
                "Rectangle Area: " + rectangle.area()
        );
    }
}
