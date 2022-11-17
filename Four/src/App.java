import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank();

        System.out.println(bank.addCustomer("asd", 100));
        System.out.println(bank.addCustomer("zdfg", 157));
        System.out.println(bank.addCustomer("rgx", 35));
        System.out.println(bank.addCustomer("axvd", 300));

        // System.out.println(bank.getCustomers());
        // Collections.sort(bank.getCustomers(), new BalanceComparator());
        // System.out.println(bank.getCustomers());

        System.out.println(bank.getCustomerByName("a"));
    }
}
// https://drive.google.com/file/d/1jk3zGRsN3mfw9CffMUJQuf7uR6sb13qO/view
// https://www.youtube.com/watch?v=U8hMrQtgabQ&t=717s&ab_channel=%D0%9F%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%B0%D0%BD%D0%B8%D1%8F
// https://www.youtube.com/watch?v=T3oXyVYmkyY&ab_channel=EugeneSuleimanov
// https://www.examclouds.com/ru/java/java-core-russian/interface-queue
// https://javarush.ru/groups/posts/klass-arraylist
// https://www.bestprog.net/ru/2019/07/14/java-exceptions-operators-throw-throws-examples-ru/