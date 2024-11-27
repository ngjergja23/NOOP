import java.util.ArrayList;
import java.util.Collections;

public class ClearAllElements<E> implements CommandOnList<E>{

    private ArrayList<E> arrayList;
    private ArrayList<E> backupList;

    public ClearAllElements(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
        this.backupList = null;
    }

    @Override
    public void runCommand() {                                 //clear
        if (arrayList.isEmpty()){
            System.out.println("List already empty ");
        }else {
            backupList.addAll(arrayList);
            arrayList.clear();
            System.out.println("List cleared ");
        }
    }

    @Override                                                 //add all
    public void undoCommand() {
        if (backupList.isEmpty()){
            System.out.println("Nothing to undo ");
        }else {
            arrayList.addAll(backupList);
            backupList.clear();
            System.out.println("Original list recovered ");
        }
    }

    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
