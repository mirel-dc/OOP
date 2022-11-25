public class Document implements Comparable<Document> {
    public int delay, order;
    public TypePapper typePapper;
    public TypeDoc typeDoc;
    public static int staticOrder;

    public Document(String delay, String typePapper, String typeDoc) {
        this.delay = Integer.parseInt(delay);
        if (typePapper.equals("A2"))
            this.typePapper = TypePapper.A2;
        else if (typePapper.equals("A3"))
            this.typePapper = TypePapper.A3;
        else if (typePapper.equals("A4"))
            this.typePapper = TypePapper.A4;
        else if (typePapper.equals("A5"))
            this.typePapper = TypePapper.A5;

        if (typeDoc.equals("pdf"))
            this.typeDoc = TypeDoc.PDF;
        else if (typeDoc.equals("doc"))
            this.typeDoc = TypeDoc.DOC;
        else if (typeDoc.equals("excel"))
            this.typeDoc = TypeDoc.EXCEL;

        staticOrder++;
        this.order = staticOrder;
    }

    @Override
    public int compareTo(Document doc) {
        return this.order - doc.order;
    }

    @Override
    public String toString() {
        return "Document typeDoc=" + typeDoc + ", order=" + order + ", delay=" + delay + ", typePapper=" + typePapper;
    }
}
