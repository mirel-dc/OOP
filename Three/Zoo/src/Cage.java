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

    private static void get(List<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + list.get(i));
        }
    }

    public static void getHerbCage() {
        get(cageHerb);
    };

    public static void getPredCage() {
        get(cagePred);
    }
}