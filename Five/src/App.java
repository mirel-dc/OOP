import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(new Dispatcher());
        Dispatcher dispatcher = new Dispatcher();

        Document doc1 = new Document("5", "A2", "doc");
        Document doc2 = new Document("6", "A4", "excel");
        Document doc3 = new Document("4", "A3", "pdf");
        Document doc4 = new Document("3", "A5", "pdf");

        dispatcher.addDoc(doc1);
        dispatcher.addDoc(doc2);
        dispatcher.addDoc(doc3);
        dispatcher.addDoc(doc4);

        Scanner in = new Scanner(System.in);
        String[] parser = new String[4];

        System.out.println("Commands: ");
        System.out.println("-------------------------------------------");
        System.out.println("add-doc (String delay, String typePapper, String typeDoc)");
        System.out.println("print");
        System.out.println("skip");
        System.out.println("pause");
        System.out.println("get-unprinted");
        System.out.println("get-avg-delay");
        System.out.println("get-printed");
        System.out.println("get-printed-by-typedoc");
        System.out.println("get-printed-by-delay");
        System.out.println("get-printed-by-typepapper");
        System.out.println("exit");
        System.out.println("-------------------------------------------");
        while (true) {

            parser = in.nextLine().split(" ");

            if (parser[0].equals("")) {
            }

            // exit
            if (parser[0].equals("exit")) {
                dispatcher.stop();
                in.close();
                break;
            }

            // add-doc
            if (parser[0].equals("add-doc")) {
                if (parser.length != 4) {
                    System.out.println("--Not enough information");
                } else {
                    System.out.println("--New" + dispatcher.addDoc(parser[1], parser[2],
                            parser[3]));
                }
            } else

            // print
            if (parser[0].equals("print")) {
                try {
                    if (thread.getState().equals(Thread.State.NEW))
                        thread.start();
                    else if (thread.getState().equals(Thread.State.WAITING))
                        dispatcher.resume();
                } catch (IllegalThreadStateException e) {
                    System.out.println("Already running!");
                }
            } else

            // skip
            if (parser[0].equals("skip")) {
                dispatcher.skip();
            } else

            // pause
            if (parser[0].equals("pause")) {
                dispatcher.pause();
                System.out.println("--QUEUE: ");
                for (Document document : dispatcher.getQueue()) {
                    System.out.println(document);
                }
            } else

            // get-unprinted
            if (parser[0].equals("get-unprinted")) {
                for (Document document : dispatcher.getQueue()) {
                    System.out.println(document);
                }
            }

            // get-avg-delay
            if (parser[0].equals("get-avg-delay")) {
                System.out.println(dispatcher.getAvgDelay());
            } else

            // get-printed
            if (parser[0].equals("get-printed")) {
                Collections.sort(dispatcher.getArrayDocuments());
                for (Document document : dispatcher.getArrayDocuments()) {
                    System.out.println(document);
                }
            } else

            // get-printed-by-typedoc
            if (parser[0].equals("get-printed-by-typedoc")) {
                Collections.sort(dispatcher.getArrayDocuments(), new TypedocComparator());
                for (Document document : dispatcher.getArrayDocuments()) {
                    System.out.println(document);
                }
            } else

            // get-printed-by-delay
            if (parser[0].equals("get-printed-by-delay")) {
                Collections.sort(dispatcher.getArrayDocuments(), new DelayComparator());
                for (Document document : dispatcher.getArrayDocuments()) {
                    System.out.println(document);
                }
            } else

            // get-printed-by-typepapper
            if (parser[0].equals("get-printed-by-typepapper")) {
                Collections.sort(dispatcher.getArrayDocuments(), new TypepapperComparator());
                for (Document document : dispatcher.getArrayDocuments()) {
                    System.out.println(document);
                }
            }
        }
    }
}
