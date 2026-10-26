abstract class Shape {

    protected String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    void displayName() {
        System.out.println("Shape: " + name);
    }
}