package ducks;

public class App {
                                                                 //putem konstruktora
    public static void main(String[] args) {                     //rubberduck
        DuckClientSimulator client = new DuckClientSimulator();  //flywithrocket, mutequack
        client.startSimulation();
                                                                 //putem settera
        client.setDuck(new MallardDuck());                       //mallardduck
        client.getDuck().setFlyable(new FlyWithWings());         //flywithwings, quackloud
        client.getDuck().setQuackable(new QuackLoud());
        client.startSimulation();

        client.setDuck(new WoodDuck());
        client.getDuck().setFlyable(new NoFly());
        client.getDuck().setQuackable(new QuackLoud());
        client.startSimulation();
    }

}
//lijepo
//za dr napraviti koristenjem predloska strategy jednostavni kalkulator (+,-,*,/)