package org.example.notifyMeWallmart.observer;

import org.example.notifyMeWallmart.observable.StockObservable;

public class AndroidNotifyObserver implements NotifyObserver{

    private final StockObservable observable;

    public AndroidNotifyObserver(StockObservable observable){
        this.observable = observable;
    }
    @Override
    public void sendNotification() {
        System.out.println("Notification sent to Android stock available now.");
    }
}
