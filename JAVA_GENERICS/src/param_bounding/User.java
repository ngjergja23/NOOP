package param_bounding;

public class User extends Person{

    private int id;
    private static int cntID = 10;

    protected User(String name) {
        super(name);
    }

//    private String name;
//
//    public User(String name) {
//        this.name = name;
//    }

    public void performAction(){
        System.out.println(getClass().getSimpleName() + "performing something...");
    }

    @Override
    public void someMethod() {

    }
}
