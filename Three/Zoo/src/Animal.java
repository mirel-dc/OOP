import java.util.List;
import java.util.ArrayList;

public abstract class Animal implements Walker, Voicer {
    protected String name;
    protected AnimalType animalType;

    List<Animal> animals = new ArrayList<>();

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " makes a move");
    }

    public void voice() {
        System.out.println(name + " makes a sound");
    }
}
