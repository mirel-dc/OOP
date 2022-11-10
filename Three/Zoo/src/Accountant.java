import java.util.List;

public class Accountant extends Employee {
    private int predCount = 0, herbCount = 0;

    Accountant(String name) {
        super(name);
    }

    void getBalance(List<Animal> animals) {
        animals = Zoo.getAnimals();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).animalType == AnimalType.HERBIVORE) {
                herbCount++;
            } else {
                predCount++;
            }
        }
        System.out.println("There is " + herbCount + " Herbivore and " + predCount + " Predators in our ZOO");
    };

    @Override
    public String toString() {
        return "Accountant " + name;
    }
}
