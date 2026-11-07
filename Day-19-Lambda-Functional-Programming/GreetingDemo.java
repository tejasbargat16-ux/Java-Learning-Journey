
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class GreetingDemo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, Tejas!");
            }
        };

        greeting.sayHello();
    }
}
