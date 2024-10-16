package wildcard;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E> {

    private final List<E> list;


    public MultiListCLS() {
        this.list = new ArrayList<>();
    }

    public MultiListCLS(List<E> list) {
        this.list = list;
    }

    public void listAll(){
        if (list.isEmpty()){
            System.out.println("List empty!");
        }else {
            for (E element : list){
                System.out.println(element);
            }
        }
    }

    public void compareTwoList(List<?> anotherList){

        System.out.println(this.list.size() - anotherList.size());

    }


}
