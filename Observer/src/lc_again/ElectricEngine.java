package lc_again;

public class ElectricEngine implements Engine{
    @Override
    public void startEngine() {
        System.out.println("zap bla");
    }

    @Override
    public void stopEngine() {
        System.out.println("zap zzz");
    }
}
