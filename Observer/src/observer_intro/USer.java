package observer_intro;

public class USer implements ServiceUser {

    private int id;
    private static int cntID = 100;
    private String username;

    public USer(String username) {
        this.id = cntID++;
        this.username = username;
    }

    @Override
    public void provideSignInInfo(String username, String passwd) {
        System.out.println(username);
        System.out.println(passwd);
    }

    @Override
    public String toString() {
        return "USer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

}
