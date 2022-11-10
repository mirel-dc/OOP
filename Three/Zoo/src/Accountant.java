public class Accountant extends Employee {
    Accountant(String name) {
        super(name);
        humanType = HumanType.EMPLOYEE;
    }

    void getBalance(Animal[] animals) {
        // TODO Balance
    };

    @Override
    public String toString() {
        return "Accountant " + name;
    }
}
