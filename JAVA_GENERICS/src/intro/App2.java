package intro;

import java.util.ArrayList;

public class App2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abd");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);

        ArrayList<User> list3 = new ArrayList<>();
        list3.add(new User("Ana"));

        AUX_CLS.listElementList(list1);
        AUX_CLS.listElementList(list2);
        AUX_CLS.listElementList(list3);
        AUX_CLS.listElementList2(list1);


    }

}
