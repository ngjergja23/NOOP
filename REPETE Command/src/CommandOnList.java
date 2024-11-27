public interface CommandOnList<E> {

    void runCommand();
    void undoCommand();

}
