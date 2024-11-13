package adapter_intro;

import java.util.*;

public class TestApp {

    public static void main(String[] args) {

//        String[] strings = {"q", "w", "e", "r"};
//        ArrayList<String> stringList = new ArrayList<>(List.of(strings));
//
//        Client<String> client1 = new Client<>(stringList.iterator());
////        client1.someInfo();
//        client1.removeElement();
//        System.out.println("--------After removal: ");
//        client1.someInfo();
//        System.out.println(stringList);


        Enumeration enumString = new StringTokenizer("String tokenizer");
//        AdapterEnumeration<String> adapter = new AdapterEnumeration<>(new StringTokenizer()){

        AdapterEnumeration<String> adapter = new AdapterEnumeration<String>(enumString);
        Client<String> client2 = new Client<>(adapter);  //  <---

        client2.someInfo();


    }

}
