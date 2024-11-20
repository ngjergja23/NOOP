package remote_controll;

import java.util.Stack;

public class ControllerHome {  //smarthome daljinski ili aplikacija na mobu

    private Command command;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public ControllerHome() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButtonRun(){
        if (command != null){           // tu cemo se pobrinuti sa setterom da command nije null
            command.run();              //njemu je delgiramo
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }else {
            System.out.println("Command not set!");
            System.out.println("Redo stack empty!");

        }
    }
    public void pressButtonUndo(){
        if (!undoStack.isEmpty()){
            command = undoStack.pop();
            command.undo();
            redoStack.push(command);
            listUndoStack();
            listRedoStack();

        }else {
            System.out.println("Command not set!");
            System.out.println("Undo stack empty!");
        }
    }
    public void pressButtonRedo(){
        if (!redoStack.isEmpty()){
            command = redoStack.pop();
            command.run();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }else {
            System.out.println("Redo stack empty!");
        }
    }

    public void listUndoStack(){
        if (!undoStack.isEmpty()){
            System.out.println("=================== Undo stack content ==========================");
            for (Command cmd : undoStack){
                System.out.println("command: " + cmd);
            }
        }else {
            System.out.println("Undo stack empty!");

        }
    }
    public void listRedoStack(){
        if (!redoStack.isEmpty()){
            System.out.println("=================== Redo stack content ==========================");
            for (Command cmd : redoStack){
                System.out.println("command: " + cmd);
            }
        }else {
            System.out.println("Redo stack empty!");

        }
    }

    public void resetBtnController(){
        command = null;
        undoStack.clear();
        redoStack.clear();
        System.out.println("State reset -> set new command! ");
    }

}
