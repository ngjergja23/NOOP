package ducks;

public class MuteQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("no sound!");
    }
}
