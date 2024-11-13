package ducks;

public class QuackLoud implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quacking loud");
    }
}
