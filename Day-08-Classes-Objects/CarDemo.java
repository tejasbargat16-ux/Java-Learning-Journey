public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "M4";
        car1.year = 2026;

        Car car2 = new Car();

        car2.brand = "Toyota";
        car2.model = "Supra";
        car2.year = 2025;

        car1.displayDetails();
        car2.displayDetails();
    }
}
