package intro;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();
//        list.add(100);
//        list.add("abc");
//        list.add(23.57);
        list.add(new User("Zoki"));

        listAll(list);
        listAll2(list);

    }

    public static void listAll(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println("element: " + list.get(i));
        }
    }


    public static void listAll2(ArrayList list) {
        for (Object user : list){
            System.out.println("User: " + user);
        }
    }

}