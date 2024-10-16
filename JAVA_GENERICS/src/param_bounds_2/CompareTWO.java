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
            System.out.println("first one is larger");
        } else if (fst.compareTo(snd) < 0){
            System.out.println("second one is larger");
        } else {
            System.out.println("same");
        }
    }


}
