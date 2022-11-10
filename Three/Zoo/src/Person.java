public abstract class Person implements Walker, Speaker {
    protected String name;
    protected HumanType humanType;

    Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " makes a step");
    }

    public void speak() {
        System.out.println(name + " speaks");
    }

    @Override
    public String toString() {
        return "Person " + name;
    }
}
