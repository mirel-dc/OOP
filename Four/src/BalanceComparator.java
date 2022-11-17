import java.util.Comparator;

public class BalanceComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer cust1, Customer cust2) {
        return cust1.balance - cust2.balance;
    }
}
