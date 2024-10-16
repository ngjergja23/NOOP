package param_bounding;

import java.util.ArrayList;
import java.util.List;

public class SimpleClass <T extends User> {

    private final ArrayList<T> users;

    public SimpleClass() {
        this.users = new ArrayList<>();
    }

    public SimpleClass(T[] users) {
        this.users = new ArrayList<>(List.of(users)); //Arrays.asList()
    }

    public void performSomething(){
        if (users.isEmpty()){
            System.out.println("No users! ");
        }else {
            for (T user : users){
                user.performAction();
            }
        }
    }
}
