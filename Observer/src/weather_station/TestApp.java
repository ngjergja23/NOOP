package weather_station;

public class TestApp {

    public static void main(String[] args) {

        WeatherStation WS = new WeatherStation(13, 68, 1013);

        MobilePhoneApp app1 = new MobilePhoneApp();
        app1.setWS(WS);
        MobilePhoneApp app2 = new MobilePhoneApp();
        app2.setWS(WS);

        WS.add(app1);
        WS.add(app2);

        WS.setStateData(7, 70, 1014);

    }

}
