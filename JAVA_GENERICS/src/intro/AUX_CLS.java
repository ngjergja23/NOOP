package intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStringList(ArrayList<String> lst) {
        for (String s : lst) {
            System.out.println(s);
        }
    }

    public static void listIntegerList(ArrayList<Integer> lst){
        for (Integer i : lst){
            System.out.println(i);
        }

    }

    public static void listUserList(ArrayList<User> lst){
        for (User u : lst){
            System.out.println(u);
        }

    }

    public static <E> void listElementList(ArrayList<E> lst){

        if (lst.isEmpty()){
            System.out.println("List empty! ");
        }else {
            for (E el : lst){
                System.out.println("element: " + el);
            }
        }

    }

    public static <Q> void listElementList2(ArrayList<Q> lst){

        Iterator<Q> iter = lst.iterator();
        while (iter.hasNext()){
            System.out.println("element: " + iter.next());
        }

    }

    public static <K, V> void listElementMap(Map<K, V> map){
        if (map.isEmpty()){
            System.out.println("Map empty! ");
        }else {
            System.out.println("--------------" + Integer.toHexString(map.hashCode()) + "-----------------");
            for (Map.Entry<K,V> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
            }
        }
    }




}
