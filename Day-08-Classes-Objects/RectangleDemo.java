public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.length = 10;
        rectangle.width = 5;

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
