package repete_command;

import java.util.ArrayList;

public class RemoveElement<E> implements CommandOnList{

    private ArrayList<E> arrayList;
    private E element;
    private boolean flag;

    public RemoveElement(ArrayList<E> arrayList, E element) {
        this.arrayList = arrayList;
        this.element = element;
        this.flag = false;
    }

    @Override
    public void runCommand() {                                 //do REMOVE = remove
        if (arrayList.contains(element)){
            flag = arrayList.remove(element);
        }else {
            System.out.println("List doesnt contain such element");
        }
    }

    @Override
    public void undoCommand() {
        if(flag){
            arrayList.add(element);
            System.out.println("Element added to a list ");    //undo REMOVE = add
            System.out.println("Type of element: " + element.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
