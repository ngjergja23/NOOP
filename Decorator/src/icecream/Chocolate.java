package icecream;

public class Chocolate extends AbsIceCream{


    protected Chocolate(String name, double price, int amount) {
        super(name, price, amount);
    }

    @Override
    protected void cost() {
        double price = unitPrice * amount;
        System.out.println("Price for: " + getClass().getSimpleName() + " is: " + price);
    }

}
