public class Predator extends Animal {
    Predator(String name) {
        super(name);
        animalType = AnimalType.PREDATOR;
    }

    @Override
    public void walk() {
        System.out.print("Predator ");
        super.walk();
    }

    @Override
    public void voice() {
        System.out.println(name + " makes agressive sound");
    }
}
