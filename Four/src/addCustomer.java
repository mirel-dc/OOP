public class addCustomer implements Command {
    Bank bank;

    public addCustomer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void execute() {
        bank.addCustomer(null, 0)
    }
}
