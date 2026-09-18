public class SubstringExample {

    public static void main(String[] args) {

        String text = "JavaProgramming";

        String part1 = text.substring(0, 4);
        String part2 = text.substring(4);

        System.out.println("Original: " + text);
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);

    }
}
