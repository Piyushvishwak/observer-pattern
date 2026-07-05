package org.example.notifyMeWallmart.observable;

import org.example.notifyMeWallmart.observer.NotifyObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable{
    private final List<NotifyObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotifyObserver observer){
        observerList.add(observer);
    }
    @Override
    public void removeObserver(NotifyObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void sendMessage() {
        for(NotifyObserver observer : observerList){
            observer.sendNotification();
        }
    }
    @Override
    public void setStockCount(Integer newStockAdded){
        if (stockCount == 0) {
            sendMessage();
        }
        stockCount+=newStockAdded;
    }
}
