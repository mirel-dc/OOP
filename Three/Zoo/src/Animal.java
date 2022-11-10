public abstract class Animal implements Walker, Voicer {
    protected String name;
    protected AnimalType animalType;

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " makes a move");
    }

    public void voice() {
        System.out.println(name + " makes a sound");
    }

    @Override
    public String toString() {
        return "Animal " + name;
    }
}
