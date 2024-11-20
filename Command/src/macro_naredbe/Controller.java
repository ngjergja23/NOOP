package macro_naredbe;

public class Controller {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.run();
    }

    public void pressReverseActionCommand(){
        command.undo();
    }


}
