package observer_intro;

public class Service {

//    private USer user;
    private ServiceUser serviceUser;

    private String serviceName;

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }

    public void singInToService(ServiceUser usr){
        this.serviceUser = usr;
        System.out.println("Signing in..");
    }

    @Override
    public String toString() {
        return "Service{" +
                "user=" + serviceUser +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
