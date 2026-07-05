package org.example;

import org.example.weatherObserver.*;

public class Main {
    public static void main(String[] args) {
        // Create the weather station observable
        WSObservable weatherStation = new WSObservableImpl();

        // Create concrete displays and register them via constructor injection
        DisplayObserver phone = new PhoneDisplay(weatherStation);
        DisplayObserver tv = new TVDisplay(weatherStation);
        DisplayObserver car = new CarDisplay(weatherStation);

        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);
        weatherStation.addObserver(car);

        // Update temperature
        System.out.println("\n--- Setting temperature to 25°C ---");
        weatherStation.setTemperature(25);

        // Update temperature again
        System.out.println("\n--- Setting temperature to 30°C ---");
        weatherStation.setTemperature(30);

        // Deregister one display
        System.out.println("\n--- Deregistering TV Display ---");
        weatherStation.deleteObserver(tv);

        // Update temperature again,
        System.out.println("\n--- Setting temperature to 27°C ---");
        weatherStation.setTemperature(27);
    }
}