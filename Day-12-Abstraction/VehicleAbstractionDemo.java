abstract class VehicleAbstraction {

    abstract void start();
}

class CarVehicle extends VehicleAbstraction {

    @Override
    void start() {
        System.out.println("Car engine started.");
    }
}

class BikeVehicle extends VehicleAbstraction {

    @Override
    void start() {
        System.out.println("Bike engine started.");
    }
}

public class VehicleAbstractionDemo {

    public static void main(String[] args) {

        VehicleAbstraction car = new CarVehicle();
        VehicleAbstraction bike = new BikeVehicle();

        car.start();
        bike.start();
    }
}