public class AreaOverloading {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        AreaOverloading calculator =
                new AreaOverloading();

        System.out.printf(
                "Circle Area: %.2f%n",
                calculator.area(5)
        );

        System.out.println(
                "Rectangle Area: " +
                calculator.area(10, 4)
        );

        System.out.println(
                "Square Area: " +
                calculator.area(5, 5)
        );
    }
}
