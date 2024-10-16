package wildcard;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5);
        MultiListCLS <Integer> listCLS = new MultiListCLS<>(integerList);

        List<Integer> integerList2 = List.of(21,22,23,24);
        listCLS.compareTwoList(integerList2);

        //wildcard se ne moze koristiti za parametrizaciju klasa i sučelja
        //ali moze metoda

        Test test = new Test();
        ArrayList<Integer> integers = new ArrayList<>();
        test.addElement(230,integers);
        test.addElement(123,integers);
        test.addElement(234,integers);
        test.addElement(345,integers);

        test.listAll(integers);

    }

}
