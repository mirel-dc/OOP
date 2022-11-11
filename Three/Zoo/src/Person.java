public abstract class Person implements Walker, Speaker {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " makes a step");
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks");
    }

    @Override
    public String toString() {
        return "Person " + name;
    }
}
