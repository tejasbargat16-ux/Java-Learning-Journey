public class GenericMethodDemo {

    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        display("Java");
        display(100);
        display(45.5);
        display(true);
    }
}