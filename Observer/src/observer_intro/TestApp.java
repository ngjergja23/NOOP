package observer_intro;

public class TestApp {

    public static void main(String[] args) {

        Service service = new Service("Newsletters");
        service.singInToService(new USer("ana"));



    }
}
