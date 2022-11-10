public interface Observed {
    public void addObserver(Visitor visitor);

    public void removeObserver(Visitor visitor);

    public void notifyObserver();
}
