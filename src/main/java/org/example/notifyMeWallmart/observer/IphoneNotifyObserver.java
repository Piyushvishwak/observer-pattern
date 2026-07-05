package org.example.notifyMeWallmart.observer;

import org.example.notifyMeWallmart.observable.StockObservable;

public class IphoneNotifyObserver implements NotifyObserver {

    private final StockObservable obj;

    public IphoneNotifyObserver(StockObservable obj) {
        this.obj = obj;
    }
    @Override
    public void sendNotification() {
        System.out.println("Notification sent for Iphone stock available now.");
    }

}
