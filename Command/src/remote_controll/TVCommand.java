package remote_controll;

public class TVCommand implements Command{

    private final TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        tv.tvOn();          //tv zna kako
    }

    @Override
    public void undo() {
        tv.tvOff();
    }

    @Override
    public String toString() {
        return "TVCommand{" +
                "tv=" + tv +
                '}';
    }
}
