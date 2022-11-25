import java.util.Comparator;

public class DelayComparator implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
        return doc1.delay - doc2.delay;
    }
}
