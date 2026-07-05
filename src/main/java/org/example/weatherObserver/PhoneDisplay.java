package org.example.weatherObserver;

public class PhoneDisplay implements DisplayObserver {
    private final WSObservable weatherStation;

    public PhoneDisplay(WSObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(int temperature) {
        System.out.println("Phone Display updated. Current temperature: " + temperature + "°C");
    }
}
