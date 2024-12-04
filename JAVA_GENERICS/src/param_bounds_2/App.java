package param_bounds_2;

public class App {

    public static void main(String[] args) {
                                                                        //samo koji extendaju comparable
//        String first = "Simple string";
//        String second = "Second string, and it is slightly different";
//        CompareTWO<String> compareTWOStrings = new CompareTWO<>(first, second);
//        compareTWOStrings.compareTwo();
        System.out.println("----------------------------------");
        User user1 = new User("ana");
        User user2 = new User("nikolina");

        CompareTWO<User> compareTWOUsers = new CompareTWO<>(user1, user2);
        compareTWOUsers.compareTwo();

    }

}
