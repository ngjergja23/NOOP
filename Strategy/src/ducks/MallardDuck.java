package ducks;

public class MallardDuck extends Duck{

    @Override
    protected void display() {
        System.out.println("Display for: " + getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("Swimming for: " + getClass().getSimpleName());
    }
}
