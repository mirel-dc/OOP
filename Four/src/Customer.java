import java.util.UUID;

public class Customer implements Comparable<Customer> {
    UUID id;
    String name;
    int balance;

    Customer() {
    }

    Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        if (name != null)
            return "id=" + id + ", name=" + name + ", balance=" + balance;
        else
            return "No such customer";
    }

    @Override
    public int compareTo(Customer cust1) {
        return this.name.compareTo(cust1.name);
    }
}
