public class addCustomer implements Command {
    Bank bank;

    public addCustomer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void execute<String,int>(String s,int)
    {
        bank.addCustomer(null, 0)
    }
}
