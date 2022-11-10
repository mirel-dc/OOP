public class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks with Animals");
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
