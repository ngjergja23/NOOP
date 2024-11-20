package macro_naredbe;

import java.util.ArrayList;
import java.util.Collections;

public class MacroCmdFST implements Command{

    //spremanje sekvenci komandi? lista
    private final ArrayList<Command> commands;

    public MacroCmdFST(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void run() {

        if (commands.isEmpty()){
            System.out.println("Nothing to run!");
        }else {
            for (Command cmd : commands){
                cmd.run();
            }
        }
    }

    @Override
    public void undo() {
        Collections.reverse(commands);
        for (Command cmd : commands){
            cmd.undo();
        }
        Collections.reverse(commands);
    }
}
