package AnimalExercise;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        //@TODO: implement me
        if (!type) {
            return null;
        }
        if (type == Cat) {
            return new Cat();
        } else if (type == Cow) {
            return new Cow();
        } else if (type == Dog) {
            return new Dog();
        } else if (type == Duck) {
            return new Duck();
        }
        return null;
    }
}
