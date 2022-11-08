public class Visitor extends Person {
    Visitor(String name) {
        super(name);
        humanType = HumanType.VISITOR;
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks with Visitors");
    }
}
