package repete_command;

import java.util.ArrayList;

public class AddNewElement<E> implements CommandOnList{

    private ArrayList<E> arrayList;
    private E element;

    public AddNewElement(ArrayList<E> arrayList, E element) {
        this.arrayList = arrayList;
        this.element = element;
    }

    @Override
    public void runCommand() {                          //do ADD = add
        if (element == null){
            System.out.println("Cannot add null element to a list ");
        }else if(arrayList.contains(element)){
            System.out.println("List already contains such element ");
        }else{
            arrayList.add(element);
            System.out.println("Element added to a list ");
            System.out.println("Type of element: " + element.getClass().getSimpleName());
        }
    }

    @Override
    public void undoCommand() {                       //undo ADD = remove
        if (arrayList.contains(element)){
            arrayList.remove(element);
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
