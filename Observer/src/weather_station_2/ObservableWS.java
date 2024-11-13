package weather_station_2;

import weather_station.Observer;

public interface ObservableWS {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();

}
