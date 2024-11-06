package adapter_intro;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumeration<E> implements Iterator<E> {

    private Enumeration<E> enumer;

    public AdapterEnumeration(Enumeration<E> enumer) {
        this.enumer = enumer;
    }

    @Override
    public boolean hasNext() {
        return enumer.hasMoreElements();
    }

    @Override
    public E next() {
        return enumer.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("Does not support this method!");
        System.out.println("Using 'asIterator' method might not be supported on some older versions!");
        enumer.asIterator().remove();
    }

}
