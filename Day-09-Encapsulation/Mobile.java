public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile(
            String brand,
            String model,
            double price) {

        this.brand = brand;
        this.model = model;

        setPrice(price);
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println(
                    "Invalid price."
            );
        }
    }

    public double getPrice() {
        return price;
    }

    public void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {

        Mobile mobile =
                new Mobile(
                        "Samsung",
                        "Galaxy A16",
                        15000
                );

        mobile.display();
    }
}
