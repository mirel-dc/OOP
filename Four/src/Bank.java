import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private Queue<Transaction> transactions = new LinkedList<>();

    Customer addCustomer(String name, int balance) {
        Customer customer = new Customer(name, balance);
        customers.add(customer);
        return customer;
    }

    Customer removeCustomer(UUID id) {
        Customer customer = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).id == id) {
                customer = customers.get(i);
                customers.remove(customer);
            }
        }
        return customer;
    }

    List<Customer> getCustomerByName(String name) {
        Bank bank = new Bank();
        List<Customer> containsName = new ArrayList<>();

        for (int i = 0; i < bank.getCustomers().size(); i++) {
            if (bank.getCustomers().get(i).name.contains(name)) {
                containsName.add(bank.getCustomers().get(i));
            }
        }

        // for (Customer customer : bank.getCustomers()) {
        // if (customer.name.contains(name)) {
        // containsName.add(customer);
        // System.out.println(customer);
        // }
        // }

        return containsName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Queue<Transaction> getTransactions() {
        return transactions;
    }
}
