package weather_station_2;

public class MobilePhoneApp implements Observer, Display {

    private double temp;
    private double humi;
    private double pres;


    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humi = humidity;
        this.pres = pressure;
        display();
    }

    @Override
    public void register(ObservableWS observableWS) {
        
    }

    @Override
    public void unregister(ObservableWS observableWS) {

    }

    @Override
    public void display() {
        System.out.println("---------------");
        System.out.println(temp + " °C");
        System.out.println(humi + " %");
        System.out.println(pres + " hPa");
    }
}
