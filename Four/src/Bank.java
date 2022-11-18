import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    // private List<Customer> customersByName = new ArrayList<>();
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
        // customersByName.clear();
        List<Customer> customersByName = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).name.contains(name)) {
                customersByName.add(customers.get(i));
            }
        }
        return customersByName;
    }

    Customer getCUstomerById(UUID id) {
        for (Customer customer : customers) {
            if (customer.id == id) {
                return customer;
            }
        }
        return new Customer();
    }

    boolean addTransacton(Transaction transaction) throws CustomerNotFoundException{
        Customer custFrom,custTo=new Customer();
        try {
            for (Customer customer : customers) {
                if(customer.id==transaction.fromCustomer){
                    customers.
                }
            }
            throw new CustomerNotFoundException();
        } catch (CustomerNotFoundException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Queue<Transaction> getTransactions() {
        return transactions;
    }
}
