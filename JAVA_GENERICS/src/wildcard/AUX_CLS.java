package wildcard;

import java.util.List;

public class AUX_CLS {

    public static void processNames(List<? extends UserSND> list){  //roditelj svih klasa je userSND

        for (UserSND usr : list){
            System.out.println("Name: " + usr.getName());
        }
    }

    public static <T extends UserSND> void processList(List<T> list, T newElement){ //konzistentnost tipa

        for (T el : list){
            System.out.println(el);
        }
    }

    //    public static void addUser(List<? extends UserSND> list, UserSND user){
//        list.add(user);
//    }

    public static void addUser(List<? super UserSND> list, UserSND user){
        list.add(user);
    }

}
