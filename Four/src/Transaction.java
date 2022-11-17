import java.util.UUID;

public class Transaction {
    UUID id = UUID.randomUUID();
    UUID fromCustomer, toCustomer;
    int amount, delay;
}
