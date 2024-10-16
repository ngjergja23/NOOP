package param_bounding;

public class BestUser extends User{

    protected BestUser(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("and more... by " + getClass().getSimpleName());
    }
}
