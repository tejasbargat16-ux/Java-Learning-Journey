public class AnimalArrayDemo {

    public static void main(String[] args) {

        AnimalPoly[] animals = {
            new DogPoly(),
            new CatPoly(),
            new AnimalPoly()
        };

        for (AnimalPoly animal : animals) {
            animal.sound();
        }
    }
}
