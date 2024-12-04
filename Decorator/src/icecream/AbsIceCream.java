package icecream;

public abstract class AbsIceCream {

    protected String name;
    protected double unitPrice;
    protected int amount;

    protected AbsIceCream(String name, double price, int amount) {
        this.name = name;
        this.unitPrice = price;
        this.amount = amount;
    }

    protected abstract void cost();

    public void desc(){
        System.out.println(getClass().getSimpleName() + ":");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AbsIceCream{" +
                "name='" + name + '\'' +
                ", price=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
