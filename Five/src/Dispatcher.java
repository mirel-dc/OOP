import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dispatcher implements Runnable {
    static volatile Queue<Document> documents = new PriorityQueue<Document>();
    static volatile List<Document> printedDocuments = new ArrayList<>();

    private static volatile boolean paused = false;
    private static volatile boolean running = true;
    private static volatile boolean skipping = false;
    private static final Object pauseLock = new Object();

    @Override
    public void run() {
        while (running) {
            synchronized (pauseLock) {
                if (!running) {
                    break;
                }
                if (paused)
                    try {
                        pauseLock.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                if (!running) {
                    break;
                }
            }
            if (!documents.isEmpty()) {
                Document doc;
                doc = documents.peek();
                System.out.println("--PRINTING " + doc);
                try {
                    documents.remove();
                    Thread.sleep(doc.delay * 1000);
                    if (!skipping) {
                        printedDocuments.add(doc);
                        System.out.println("--PRINTED " + doc);
                    } else {
                        System.out.println("--SKIPPED " + doc);
                        skipping = false;
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void stop() {
        running = false;
        resume();
    }

    public void pause() {
        paused = true;
    }

    public void skip() {
        skipping = true;
    }

    public void resume() {
        synchronized (pauseLock) {
            pauseLock.notifyAll();
            paused = false;
        }
    }

    public double getAvgDelay() {
        double avg = 0;
        for (Document document : printedDocuments) {
            avg += document.delay;
        }
        return avg / printedDocuments.size();
    }

    public Document addDoc(String delay, String typePapper, String typeDoc) {
        Document doc = new Document(delay, typePapper, typeDoc);
        documents.add(doc);
        return doc;
    }

    public Document addDoc(Document doc) {
        documents.add(doc);
        return doc;
    }

    public Queue<Document> getQueue() {
        return documents;
    }

    public List<Document> getArrayDocuments() {
        return printedDocuments;
    }

    public List<Document> sortPrintedByDelay() {
        Collections.sort(printedDocuments, new DelayComparator());
        return printedDocuments;
    }

    public List<Document> sortPrintedByTypedoc() {
        Collections.sort(printedDocuments, new TypedocComparator());
        return printedDocuments;
    }

    public List<Document> sortPrintedByTypepapper() {
        Collections.sort(printedDocuments, new TypepapperComparator());
        return printedDocuments;
    }

}
