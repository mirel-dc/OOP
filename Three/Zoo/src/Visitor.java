import java.util.List;
import java.util.ArrayList;

public class Visitor extends Person implements Observer {

    Visitor(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks with Visitors");
    }

    public static List<Visitor> visitors = new ArrayList<Visitor>();

    public static void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

    public static void visitorsOut() {
        for (int i = 0; i < visitors.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + visitors.get(i));
        }
    }

    @Override
    public String toString() {
        return "Visitor " + name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name + "! We have changes in our ZOO ");
        Zoo.animalsOut();
    }
}
