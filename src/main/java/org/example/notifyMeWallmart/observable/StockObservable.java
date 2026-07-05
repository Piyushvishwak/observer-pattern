package org.example.notifyMeWallmart.observable;

import java.util.List;
import org.example.notifyMeWallmart.observer.NotifyObserver;

public interface StockObservable {
    void addObserver(NotifyObserver observer);
    void removeObserver(NotifyObserver observer);
    void setStockCount(Integer stockCount);
    void sendMessage();
}
