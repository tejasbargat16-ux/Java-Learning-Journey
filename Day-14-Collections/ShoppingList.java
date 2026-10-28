import java.util.ArrayList;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Notebook");
        products.add("Pen");
        products.add("Bag");
        products.add("Bottle");
        products.add("Keyboard");

        products.remove("Bottle");

        System.out.println("Shopping List:");

        for (String product : products) {
            System.out.println(product);
        }

        System.out.println("Total: " + products.size());
    }
}