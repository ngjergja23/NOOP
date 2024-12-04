package repete_command;

public class User {
     private String userName;
     private int id;
     private static int cntID = 100;

    public User(String userName) {
        this.userName = userName;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "repete_command.User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
