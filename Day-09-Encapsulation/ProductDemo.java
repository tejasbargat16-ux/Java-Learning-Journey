public class ProductDemo {
    public static void main(String[] args) {
        Product product =
                new Product(
                        "Keyboard",
                        1200,
                        2
                );
        product.displayProduct();
        product.setPrice(1500);
        product.setQuantity(3);
        System.out.println("\nAfter Update:");
        product.displayProduct();
    }
}
