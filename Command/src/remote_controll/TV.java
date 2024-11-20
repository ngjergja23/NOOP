package remote_controll;

public class TV {

    public void tvOn(){
        System.out.println(getClass().getSimpleName() + " turning on");
    }
    public void tvOff(){
        System.out.println(getClass().getSimpleName() + " turning off");
    }

}
