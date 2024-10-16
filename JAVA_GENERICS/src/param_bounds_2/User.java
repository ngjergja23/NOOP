package param_bounds_2;

public class User implements Comparable<User> {

    private String name;
    private int id;
    private static int cntID = 10;

    public User(String name) {
        this.name = name;
        this.id = cntID++;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(User o) {
        int res = 0;
        if (this.name.length() > o.name.length()){
            res = 1;
        } else if (this.name.length() < o.name.length()) {
            res = -1;
        }
        return res;
    }

//    @Override
//    public int compareTo(User other) {
//        int res = 0;
//        if (this.id > other.id){
//            res = 1;
//        } else if (this.id < other.id){
//            res = -1;
//        }
//        return res;
//    }

}
