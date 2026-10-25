public class RectangleShape extends Shape {

    private double length;
    private double width;

    RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
