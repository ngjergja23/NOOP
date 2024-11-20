package lc_again;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void driveCar(){
        engine.startEngine();
        engine.stopEngine();
    }

}
