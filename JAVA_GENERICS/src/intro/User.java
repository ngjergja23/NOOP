package intro;

public class User {

    private int id;
    private static int cntID = 100;
    private String name;

    public User(String name) {
        this.id = cntID++;
        this.name = name;
    }

    public User(String name, int id) {  //constructor overload - preopterećenje
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {         //method override - nadjačavanje
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
                                       //ako ne osnovna od Objecta ide ime klase + hash code
}
