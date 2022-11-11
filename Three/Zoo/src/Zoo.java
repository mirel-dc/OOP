import java.util.ArrayList;
import java.util.List;

public class Zoo implements Observed {
    private static List<Animal> animals = new ArrayList<>();
    private List<Visitor> obs = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        Cage.addToCage(animal);
        notifyObserver();
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        Cage.removeFromCage(animal);
        notifyObserver();
    }

    @Override
    public void addObserver(Visitor visitor) {
        obs.add(visitor);
    }

    @Override
    public void removeObserver(Visitor visitor) {
        obs.remove(visitor);
    }

    @Override
    public void notifyObserver() {
        for (Visitor visitor : obs) {
            visitor.handleEvent();
        }
    }

    public static void animalsOut() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + animals.get(i));
        }
    }

    public static List<Animal> getAnimals() {
        return animals;
    }
}
