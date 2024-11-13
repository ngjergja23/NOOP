package weather_station_2;

import weather_station.ObservableWS;
import weather_station.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWS {

    private double temp;
    private double humidity;
    private double pressure;

    private final List<Observer> observers;

    public WeatherStation(List<Observer> observers) {
        this.observers = new ArrayList<>();
    }


    @Override
    public void add(Observer observer) {
        if (observers.contains(observer)){
            System.out.println("This observer is already observing :) ");
        } else {
            observers.add(observer);
            System.out.println("Observer successfully added to the collection!");
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
            System.out.println("Observer successfully removed from the collection!");
        } else {
            System.out.println("Cannot remove, object not in the collection!");
        }
    }

    @Override
    public void notifyAllObservers() {
        if (observers.isEmpty()){
            System.out.println("No one to notify :( ");
        } else {
            for (Observer obs : observers){
                obs.update();
            }
        }
    }
}
