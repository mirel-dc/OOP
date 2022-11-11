public class Herbivore extends Animal {

    Herbivore(String name) {
        super(name);
        animalType = AnimalType.HERBIVORE;
    }

    @Override
    public void walk() {
        System.out.print("Herbivore ");
        super.walk();
    }

    @Override
    public void voice() {
        System.out.println(name + " makes cute sound");
    }

    @Override
    public String toString() {
        return name;
    }
}
