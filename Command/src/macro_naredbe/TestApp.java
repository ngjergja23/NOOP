package macro_naredbe;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

        GarageDoorOpen gdo = new GarageDoorOpen();
        GarageLightON glo = new GarageLightON();
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(gdo);
        commands.add(glo);
        MacroCmdFST macro = new MacroCmdFST(commands);
        macro.run();
        macro.undo();
        macro.run();

    }

}
