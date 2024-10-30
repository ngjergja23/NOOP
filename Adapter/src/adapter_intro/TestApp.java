package adapter_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        String[] strings = {"q", "w", "e", "r"};
        ArrayList<String> stringList = new ArrayList<>(List.of(strings));

        Client<String> client1 = new Client<>(stringList.iterator());
        client1.someInfo();
        client1.removeElement();
        System.out.println("--------After removal: ");
        client1.someInfo();




    }

}
