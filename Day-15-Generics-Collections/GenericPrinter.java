public class GenericPrinter {

    public static <T> void printArray(T[] values) {

        for (T value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        String[] languages = {
            "Java", "Python", "C++"
        };

        Integer[] numbers = {
            10, 20, 30
        };

        printArray(languages);

        System.out.println("--- Numbers ---");

        printArray(numbers);
    }
}