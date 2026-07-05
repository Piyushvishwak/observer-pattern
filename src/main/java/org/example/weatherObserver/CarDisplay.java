package org.example.weatherObserver;

public class CarDisplay implements DisplayObserver{
    private final WSObservable weatherStation;

    public CarDisplay(WSObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(int temperature) {
        System.out.println("Car display updated Current temperature: "+ temperature +  "°C");
    }
}
