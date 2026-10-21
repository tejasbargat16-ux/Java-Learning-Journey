class VehiclePractice {

    String brand;

    void start() {
        System.out.println(brand + " is starting.");
    }
}

class BikePractice extends VehiclePractice {

    void ride() {
        System.out.println(brand + " is being ridden.");
    }
}

public class Main {

    public static void main(String[] args) {

        BikePractice bike = new BikePractice();

        bike.brand = "Honda";

        bike.start();
        bike.ride();
    }
}
