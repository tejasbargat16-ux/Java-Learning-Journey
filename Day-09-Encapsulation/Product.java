public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(
            String name,
            double price,
            int quantity) {

        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println(
                    "Price cannot be negative."
            );
        }
    }
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println(
                    "Quantity cannot be negative."
            );
        }
    }

    public double calculateTotal() {

        return price * quantity;
    }

    public void displayProduct() {

        System.out.println("\n===== PRODUCT =====");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println(
                "Total: ₹" + calculateTotal()
        );
    }
}
