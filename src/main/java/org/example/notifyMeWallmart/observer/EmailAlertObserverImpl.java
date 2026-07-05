package org.example.notifyMeWallmart.observer;

import org.example.notifyMeWallmart.observable.StockObservable;

public class EmailAlertObserverImpl implements NotifyObserver {
    private final StockObservable observable;
    private final String emailId;

    public EmailAlertObserverImpl(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email notification sent to " + emailId + ": Product is back in stock!");
    }
}
