public class PolymorphismDemo {

    public static void main(String[] args) {

        AnimalPoly animal;

        animal = new DogPoly();
        animal.sound();

        animal = new CatPoly();
        animal.sound();

        animal = new AnimalPoly();
        animal.sound();
    }
}
