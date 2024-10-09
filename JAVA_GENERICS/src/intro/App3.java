package intro;

import java.util.HashMap;
import java.util.Map;

public class App3 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<User, String> map2 = new HashMap<>();
        map.put(1, "jedan");
        map.put(2, "dva");
        map2.put(new User("ana"), "a");
        map2.put(new User("bea"), "b");

        AUX_CLS.listElementMap(map);
        AUX_CLS.listElementMap(map2);



    }

}
