import java.util.UUID;

public class Transaction implements Comparable<Transaction> {
    UUID id = UUID.randomUUID();
    UUID fromCustomer, toCustomer;
    int amount, delay;

    public Transaction() {
    }

    public Transaction(UUID fromCustomer, UUID toCustomer, int amount, int delay) {
        this.fromCustomer = fromCustomer;
        this.toCustomer = toCustomer;
        this.amount = amount;
        this.delay = delay;
        this.id = UUID.randomUUID();
    }

    public Transaction(UUID id, UUID fromCustomer, UUID toCustomer, int amount, int delay) {
        this.id = id;
        this.fromCustomer = fromCustomer;
        this.toCustomer = toCustomer;
        this.amount = amount;
        this.delay = delay;
    }

    @Override
    public int compareTo(Transaction transaction) {
        return this.delay - transaction.delay;
    }

    @Override
    public String toString() {
        if (fromCustomer != null)
            return "Transaction: id=" + id + ", from=" + fromCustomer + ", to=" + toCustomer + ", value=" + amount
                    + ", delay=" + delay;
        else
            return "No transaction";
    }
}
