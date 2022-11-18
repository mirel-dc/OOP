import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.UUID;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private Queue<Transaction> transactions = new PriorityQueue<>();

    // CUSTOMER
    Customer addCustomer(String name, int balance) {
        Customer customer = new Customer(name, balance);
        customers.add(customer);
        return customer;
    }

    Customer removeCustomer(String strId) {
        Customer customer = new Customer();
        try {
            UUID id = UUID.fromString(strId);
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).id.equals(id)) {
                    customer = customers.get(i);
                    customers.remove(customer);
                }
            }
        } catch (IllegalArgumentException e) {
        }

        return customer;
    }

    Customer changeCustomer(String strId, String name, int balance) {
        UUID id = UUID.fromString(strId);
        for (Customer customer : customers) {
            if (customer.id.equals(id)) {
                customer.name = name;
                customer.balance = balance;
                return customer;
            }
        }
        return new Customer();
    }

    List<Customer> getCustomerContainsName(String name) {
        List<Customer> customersByName = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).name.contains(name)) {
                customersByName.add(customers.get(i));
            }
        }
        return customersByName;
    }

    Customer getCustomerById(UUID id) {
        for (Customer customer : customers) {
            if (customer.id.equals(id)) {
                return customer;
            }
        }
        return new Customer();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    // TRANSACTION
    boolean addTransacton(Transaction transaction) throws CustomerNotFoundException {
        int check;
        try {
            check = 0;
            for (Customer customer : customers) {
                if (customer.id.equals(transaction.fromCustomer)) {
                    check++;
                }
                if (customer.id.equals(transaction.toCustomer)) {
                    check++;
                }
            }
            if (check != 2) {
                throw new CustomerNotFoundException();
            }
            transactions.offer(transaction);
            return true;
        } catch (CustomerNotFoundException e) {
            System.out.println(e);
        }
        return false;
    }

    Transaction runTransaction() throws NotEnoughMoney {
        try {
            Transaction transaction;
            transaction = transactions.peek();
            if (getCustomerById(transaction.fromCustomer).balance < transaction.amount) {
                transactions.remove();
                throw new NotEnoughMoney();
            } else {
                transactions.remove();
                getCustomerById(transaction.fromCustomer).balance -= transaction.amount;
                getCustomerById(transaction.toCustomer).balance += transaction.amount;
                return transaction;
            }
        } catch (NotEnoughMoney e) {
            System.out.println(e);
        }
        return new Transaction();
    }

    public Queue<Transaction> getTransactions() {
        return transactions;
    }

    // // FILE
    // public void createFile(File file) throws IOException{
    // if (!file.exists()){
    // file.createNewFile();
    // }
    // }

}
