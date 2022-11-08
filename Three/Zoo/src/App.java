public class App {
    public static void main(String[] args) throws Exception {
        Visitor vanya = new Visitor("Vanya");
        Predator archibald = new Predator("Tiger");

        vanya.speak();
        archibald.walk();
    }
}
