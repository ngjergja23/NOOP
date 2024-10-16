package wildcard;

public class UserSND {
    private String name;

    public UserSND(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserSND{" +
                "name='" + name + '\'' +
                '}';
    }
}
