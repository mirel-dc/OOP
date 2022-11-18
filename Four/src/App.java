import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank();

        bank.addCustomer("Foo", 150);
        bank.addCustomer("Bar", 300);
        bank.addCustomer("Ooz", 200);

        Scanner in = new Scanner(System.in);
        String key;
        String[] parser;

        File file = new File("transaction.txt");
        if (!file.exists())
            file.createNewFile();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        System.out.println("Commands: ");
        System.out.println("-------------------------------------------");
        System.out.println("add-customer (String name, int balance)");
        System.out.println("remove-customer (String strId)");
        System.out.println("print-customers-contains (String name)");
        System.out.println("get-customer (String strId)");
        System.out.println("print-customers");
        System.out.println("print-customers-by-name");
        System.out.println("print-customers-by-balance");
        System.out.println("change-customer (String name, int balance)");
        System.out.println("add-transaction (UUID fromCustomer, toCustomer; int amount, delay)");
        System.out.println("print-transactions");
        System.out.println("run-transaction");
        System.out.println("exit");
        System.out.println("-------------------------------------------");
        while (true) {
            parser = in.nextLine().split(" ");

            // exit
            if (parser[0].equals("exit"))
                break;

            // add-customer
            if (parser[0].equals("add-customer")) {
                if (parser.length < 3) {
                    System.out.println("--Not enough information");
                } else {
                    System.out.println("--New" + bank.addCustomer(parser[1], Integer.parseInt(parser[2])));
                }
            } else

            // remove-customer
            if (parser[0].equals("remove-customer")) {
                if (parser.length < 2) {
                    System.out.println("Not enough information");
                } else {
                    System.out.println("--Removed: " + bank.removeCustomer(parser[1]));
                }
            } else

            // print-customers-contains-name (String name)
            if (parser[0].equals("print-customers-contains")) {
                if (parser.length < 2) {
                    System.out.println("--Not enough information");
                } else {
                    for (Customer customer : bank.getCustomerContainsName(parser[1])) {
                        System.out.println(customer);
                    }
                }
            } else

            // get-customer (String strId)
            if (parser[0].equals("get-customer")) {
                if (parser.length < 2) {
                    System.out.println("--Not enough information");
                } else {
                    System.out.println(bank.getCustomerById(UUID.fromString(parser[1])));
                }
            } else

            // get-customers
            if (parser[0].equals("print-customers")) {
                for (Customer customer : bank.getCustomers()) {
                    System.out.println(customer);
                }
            } else

            // print-customers-by-name
            if (parser[0].equals("print-customers-by-name")) {
                Collections.sort(bank.getCustomers());
                for (Customer customer : bank.getCustomers()) {
                    System.out.println(customer);
                }
            } else

            // print-customers-by-balance
            if (parser[0].equals("print-customers-by-name")) {
                Collections.sort(bank.getCustomers(), new BalanceComparator());
                for (Customer customer : bank.getCustomers()) {
                    System.out.println(customer);
                }
            } else

            // add-transaction (UUID fromCustomer, toCustomer; int amount, delay)
            if (parser[0].equals("add-transaction")) {
                if (parser.length < 5) {
                    System.out.println("--Not enough information");
                } else {
                    if (bank.addTransacton(new Transaction(UUID.fromString(parser[1]), UUID.fromString(parser[2]),
                            Integer.parseInt(parser[3]), Integer.parseInt(parser[4])))) {
                        System.out
                                .println("--New "
                                        + new Transaction(UUID.fromString(parser[1]), UUID.fromString(parser[2]),
                                                Integer.parseInt(parser[3]), Integer.parseInt(parser[4])));
                    }
                }
            } else

            // print-transactions
            if (parser[0].equals("print-transactions")) {
                for (Transaction transaction : bank.getTransactions()) {
                    System.out.println(transaction);
                }
            } else

            // run-transaction
            if (parser[0].equals("run-transaction")) {
                System.out.println("Running: " + bank.runTransaction());
            } else

            // change-customer (String name, int balance)
            if (parser[0].equals("change-customer")) {
                if (parser.length < 4) {
                    System.out.println("--Not enough information");
                } else {
                    System.out.println(
                            "--Changed " + bank.changeCustomer(parser[1], parser[2], Integer.parseInt(parser[3])));
                }
            }
            // TODO FILE REALISATION
            // else
            // else
            // System.out.println("--Unknown Command");
        }

        // System.out.println(bank.addCustomer("asd", 100));
        // System.out.println(bank.addCustomer("zdfg", 157));

        // bank.getCustomers().get(0).id =
        // UUID.fromString("1e7188c9-bac9-47ba-b732-94ab531e436a");
        // bank.getCustomers().get(1).id =
        // UUID.fromString("f97f5fda-43a6-45a0-bcc3-8a4005c16179");

        // bank.addTransacton(new
        // Transaction(UUID.fromString("1e7188c9-bac9-47ba-b732-94ab531e436a"),
        // UUID.fromString("f97f5fda-43a6-45a0-bcc3-8a4005c16179"), 300, 2));

        // bank.addTransacton(new
        // Transaction(UUID.fromString("1e7188c9-bac9-47ba-b732-94ab531e436a"),
        // UUID.fromString("f97f5fda-43a6-45a0-bcc3-8a4005c16179"), 30, 1));
        // System.out.println(bank.getTransactions());

        // bank.runTransaction();

        // System.out.println(bank.getTransactions());

        // Collections.sort(bank.getCustomers(), new BalanceComparator());

    }
}
// https://drive.google.com/file/d/1jk3zGRsN3mfw9CffMUJQuf7uR6sb13qO/view
// https://www.youtube.com/watch?v=U8hMrQtgabQ&t=717s&ab_channel=%D0%9F%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%B0%D0%BD%D0%B8%D1%8F
// https://www.youtube.com/watch?v=T3oXyVYmkyY&ab_channel=EugeneSuleimanov
// https://www.examclouds.com/ru/java/java-core-russian/interface-queue
// https://javarush.ru/groups/posts/klass-arraylist
// https://www.bestprog.net/ru/2019/07/14/java-exceptions-operators-throw-throws-examples-ru/