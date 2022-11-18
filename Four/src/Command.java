public interface Command {
    public <T, S> void execute(T t, S s);
}
