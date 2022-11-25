import java.util.Comparator;

public class TypepapperComparator implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
        return doc1.typePapper.compareTo(doc2.typePapper);
    }
}
