package weather_station_2;

public interface Observer {

    void update(double temp, double humidity, double pressure);

    void register(ObservableWS observableWS);

    void unregister(ObservableWS observableWS);

}
