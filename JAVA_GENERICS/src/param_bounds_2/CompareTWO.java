package param_bounds_2;

public class CompareTWO <T extends Comparable<T>>{

    private T fst;
    private T snd;

    public CompareTWO(T fst, T snd){
        this.fst = fst;
        this.snd = snd;
    }

    public void compareTwo(){
        if (fst.compareTo(snd) > 0){
            System.out.println("first one is larger and is selected to perform something...");
        } else if (fst.compareTo(snd) < 0){
            System.out.println("second one is larger and is selected to perform something...");
        } else {
            System.out.println("both are equal");
            System.out.println("Nothing to perform...");
        }
    }


}
