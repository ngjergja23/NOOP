package weather_station;

public class MobilePhoneApp implements Observer, Display{

    private double temperat;
    private double humidity;
    private double pressure;

    private WeatherStation WS;

    public void setWS(WeatherStation WS) {
        this.WS = WS;
    }

    @Override
    public void update() {
        this.temperat = WS.getTemp();
        this.humidity = WS.getHumidity();
        this.pressure = WS.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("---------------");
        System.out.println(temperat + " °C");
        System.out.println(humidity + " %");
        System.out.println(pressure + " hPa");

    }

}
