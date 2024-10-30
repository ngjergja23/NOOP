package adapter_intro;

import java.util.Iterator;

public class Client<E> {

    private Iterator<E> iter;

    public Client(Iterator<E> iter) {
        this.iter = iter;
    }

    public void someInfo(){
        while (iter.hasNext()){
            System.out.println("Element info: " + iter.next());
        }
    }

    public void removeElement(){
        if (iter.hasNext()){
            E element = iter.next();
            System.out.println("Fetched element: " + element);
            iter.remove();
            System.out.println("Removed!");

        }

    }

}
