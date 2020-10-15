package AnimalExercise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        //@TODO: implement me
        Animal animal = null;
        if (type == AnimalType.Cat) {
            animal = new Cat("Salmon");
        } else if (type == AnimalType.Cow) {
            animal = new Cow("Grass");
        } else if (type == AnimalType.Dog) {
            animal = new Dog("Bone");
        } else if (type == AnimalType.Duck) {
            animal = new Duck("Rice");
        }
        animal.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
        return animal;
    }
}
