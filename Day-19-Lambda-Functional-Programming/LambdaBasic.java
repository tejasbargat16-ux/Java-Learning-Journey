
@FunctionalInterface
interface Message {
    void display();
}

public class LambdaBasic {
    public static void main(String[] args) {
        Message msg = () ->
            System.out.println("Learning Java Lambda!");

        msg.display();
    }
}
