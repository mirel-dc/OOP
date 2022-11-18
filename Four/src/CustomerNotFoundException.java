public class CustomerNotFoundException extends Exception {
    @Override
    public String toString() {
        return "Cannot found customer with this id";
    }
}
