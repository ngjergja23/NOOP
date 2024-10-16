package param_bounding;

public class NewUser extends User{

    protected NewUser(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("and more new things... by " + getClass().getSimpleName());
    }
}
