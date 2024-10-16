package ducks;

public class App {

    public static void main(String[] args) {
        DuckClientSimulator client = new DuckClientSimulator();
        client.startSimulation();

        client.setDuck(new MallardDuck());
        client.getDuck().setFlyable(new FlyWithWings());
        client.getDuck().setQuackable(new QuackLoud());
        client.startSimulation();

    }

}
//lijepo
//za dr napraviti koristenjem predloska strategy jednostavni kalkulator (+,-,*,/)