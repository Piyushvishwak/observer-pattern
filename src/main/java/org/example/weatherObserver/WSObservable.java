package org.example.weatherObserver;

public interface WSObservable {
    void addObserver(DisplayObserver obj);
    void deleteObserver(DisplayObserver obj);
    void notifyObservers();
    void setTemperature(int temperature);
}
