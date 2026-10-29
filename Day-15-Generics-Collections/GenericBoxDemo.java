public class GenericBoxDemo {

    public static void main(String[] args) {

        GenericBox<String> textBox = new GenericBox<>();
        textBox.setValue("Hello Java");

        GenericBox<Integer> numberBox = new GenericBox<>();
        numberBox.setValue(150);

        GenericBox<Double> decimalBox = new GenericBox<>();
        decimalBox.setValue(25.75);

        System.out.println(textBox.getValue());
        System.out.println(numberBox.getValue());
        System.out.println(decimalBox.getValue());
    }
}