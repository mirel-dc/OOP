import java.util.Comparator;

public class TypedocComparator implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
        return doc1.typeDoc.compareTo(doc2.typeDoc);
    }
}
