package wildcard;

import param_bounding.NewUser;
import param_bounding.User;

import java.util.List;

public class Test {


    public <E> void addElement(E elem, List<E> list){
        list.add(elem);
        System.out.println("Added!");
    }

    public <E> void listAll(List<E> list){
        for (E el : list){
            System.out.println(el);
        }
    }
    // (?) ne moze sa write, ide (T)
    // (?) sa read moze

    public void listAll2(List<? super User> list2){

    }

}
