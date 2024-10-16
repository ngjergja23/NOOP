package param_bounding;

public class App {

    public static void main(String[] args) {

        Integer [] ints = {1,2,3};
        User [] users = {new BestUser("Besty"),
                         new User("Usie"),
                         new NewUser("Newbie")
        };
        BestUser [] bestUsersusers = {new BestUser("Besty2"),
                new BestUser("Usie2"),
                new BestUser("Newbie2")
        };

        SimpleClass<User> UsimpleClass = new SimpleClass<>(users);
        UsimpleClass.performSomething();

        SimpleClass<BestUser> BUsimpleClass = new SimpleClass<>(bestUsersusers);
        BUsimpleClass.performSomething();
    }

}
