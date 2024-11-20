package remote_controll;

public class LightCommand implements Command{               // u knjizi su smatrali da imamo dugmad: ON, OFF i Undo
                                                            // mogli smo i drukcije
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        light.lightOn(); //kao kuhar, light zna kako da to napravi
    }

    @Override
    public void undo() {
        light.lightOff();
    }

    @Override
    public String toString() {
        return "LightCommand{" +
                "light=" + light +
                '}';
    }
}
