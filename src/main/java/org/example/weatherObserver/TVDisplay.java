package org.example.weatherObserver;

public class TVDisplay implements DisplayObserver {
    private final WSObservable weatherStation;

    public TVDisplay(WSObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(int temperature) {
        System.out.println("TV Display updated Current temperature: " + temperature + "°C");
    }
}
