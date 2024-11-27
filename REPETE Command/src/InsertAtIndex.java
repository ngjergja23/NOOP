import java.util.ArrayList;

public class InsertAtIndex<E> implements CommandOnList{

    private ArrayList<E> arrayList;
    private E element;
    private int index;

    public InsertAtIndex(ArrayList<E> arrayList, E element, int index) {
        this.arrayList = arrayList;
        this.element = element;
        this.index = index;
    }

    @Override                                              //provjeri index out of bounds i da li vec sadrzi taj element
    public void runCommand() {                             //insert
        if (index < 0 || index > arrayList.size()){
            if (arrayList.contains(element)){
                System.out.println("List already contains such element ");
            }else {
                arrayList.add(index, element);
                System.out.println("Element added to a list ");
                System.out.println("Type of element: " + element.getClass().getSimpleName());
            }
        }else {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
    }

    @Override                                              //remove at ind
    public void undoCommand() {
        if (arrayList.contains(element)){
            arrayList.remove(element);    //mozemo i preko ind remove-at
            System.out.println("Element removed from a list ");
        }else {
            System.out.println("List doesnt contain such element");
        }
    }

    @Override
    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
