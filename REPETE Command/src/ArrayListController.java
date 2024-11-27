import java.util.Stack;

public class ArrayListController {

    private CommandOnList currentCommand;
    private Stack<CommandOnList> undoStack;
    private Stack<CommandOnList> redoStack;

    public ArrayListController() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCurrentCommand(CommandOnList cmd) {
        this.currentCommand = cmd;

    }

    public void runCommand(){
        currentCommand.runCommand();
        undoStack.push(currentCommand);
        listUndoStack();
        listRedoStack();
    }

    public void undoCommand(){
        currentCommand = undoStack.pop();
        currentCommand.undoCommand();
        redoStack.push(currentCommand);
        listUndoStack();
        listRedoStack();
    }

    public void redoCommand(){
        if (!undoStack.isEmpty()){
            currentCommand = undoStack.pop();
            currentCommand.runCommand();
            listUndoStack();
            listRedoStack();
        }
    }



    public void listUndoStack(){
        System.out.println("--------------UNDO-------------------");

        if (!undoStack.isEmpty()){
            for (CommandOnList cmd : undoStack){
                System.out.println(cmd);
            }
        }
    }

    public void listRedoStack(){
        System.out.println("--------------REDO-------------------");
        if (!redoStack.isEmpty()) {
            for (CommandOnList cmd : redoStack){
                System.out.println(cmd);
            }
        }
    }


}
