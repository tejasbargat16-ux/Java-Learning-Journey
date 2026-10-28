public class InterfaceDemo {

    public static void main(String[] args) {

        Playable instrument;

        instrument = new Guitar();
        instrument.play();

        instrument = new Piano();
        instrument.play();
    }
}