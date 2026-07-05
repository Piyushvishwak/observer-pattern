package org.example.weatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WSObservable {
    private final List<DisplayObserver> displayList = new ArrayList<>();
    private int temperature;

    @Override
    public void addObserver(DisplayObserver observer) {
        displayList.add(observer);
    }

    @Override
    public void deleteObserver(DisplayObserver observer) {
        displayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver observer : displayList) {
            observer.update(temperature);
        }
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

}
