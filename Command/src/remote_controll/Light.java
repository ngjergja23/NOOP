package remote_controll;

public class Light {

    public void lightOn(){
        System.out.println(getClass().getSimpleName() + " turning on");
    }
    public void lightOff(){
        System.out.println(getClass().getSimpleName() + " turning off");
    }


}
