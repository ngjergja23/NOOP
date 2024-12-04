package repete_command;

public interface CommandOnList<E> {

    void runCommand();
    void undoCommand();

}
