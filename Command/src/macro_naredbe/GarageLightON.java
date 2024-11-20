package macro_naredbe;

public class GarageLightON implements Command{


    @Override
    public void run() {
        System.out.println("Garage light is on!");
    }

    @Override
    public void undo() {
        System.out.println("Garage light is off!");
    }
}
