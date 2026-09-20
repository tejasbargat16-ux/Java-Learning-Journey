public class ArrayMethods {
    static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static int findMaximum(int[] numbers) {
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    static int findMinimum(int[] numbers) {
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 40, 15};
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));
    }
}
