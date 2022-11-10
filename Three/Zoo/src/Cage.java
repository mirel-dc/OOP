import java.util.List;
import java.util.ArrayList;

public class Cage {
    private static List<Animal> cagePred = new ArrayList<Animal>();
    private static List<Animal> cageHerb = new ArrayList<Animal>();

    public static void addToCage(Animal animal) {
        if (animal.animalType == AnimalType.HERBIVORE) {
            cageHerb.add(animal);
        } else {
            cagePred.add(animal);
        }
    }

    public static void removeFromCage(Animal animal) {
        if (animal.animalType == AnimalType.HERBIVORE) {
            cageHerb.remove(animal);
        } else {
            cagePred.remove(animal);
        }
    }
}