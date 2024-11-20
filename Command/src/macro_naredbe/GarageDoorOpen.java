package macro_naredbe;

public class GarageDoorOpen implements Command{
    @Override
    public void run() {
        System.out.println("Garage door is opened!");

    }

    @Override
    public void undo() {
        System.out.println("Garage door is closed!");

    }
}
