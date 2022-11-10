import java.util.List;
import java.util.ArrayList;

public abstract class Animal implements Walker, Voicer, Observed {
    protected String name;
    protected AnimalType animalType;

    private static List<Animal> animals = new ArrayList<Animal>();

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " makes a move");
    }

    public void voice() {
        System.out.println(name + " makes a sound");
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public static void animalsOut() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + animals.get(i));
        }
    }

    @Override
    public String toString() {
        return "Animal " + name;
    }
}
