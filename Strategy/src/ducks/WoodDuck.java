package ducks;

public class WoodDuck extends Duck{

    @Override
    protected void display() {
        System.out.println("Display for: " + getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("Swimming for: " + getClass().getSimpleName());
    }
}
