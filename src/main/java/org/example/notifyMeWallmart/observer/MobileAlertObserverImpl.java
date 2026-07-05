package org.example.notifyMeWallmart.observer;

import org.example.notifyMeWallmart.observable.StockObservable;

public class MobileAlertObserverImpl implements NotifyObserver {
    private final StockObservable observable;
    private final String phoneNumber;

    public MobileAlertObserverImpl(StockObservable observable, String phoneNumber) {
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent to " + phoneNumber + ": Product is back in stock!");
    }
}
