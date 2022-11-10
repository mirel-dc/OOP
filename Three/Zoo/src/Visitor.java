import java.util.List;
import java.util.ArrayList;

public class Visitor extends Person implements Observer {

    private static List<Visitor> visitors = new ArrayList<Visitor>();

    Visitor(String name) {
        super(name);
        humanType = HumanType.VISITOR;
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks with Visitors");
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
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
}
