package design_pattern.observer_pattern.observable.impl;

import design_pattern.observer_pattern.observable.StockObservable;
import design_pattern.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    List<NotificationAlertObserver> notificationAlertObservers =
            new ArrayList<>();

    private boolean isAlreadyNotified = false;

    private int stockCount = 0;

    @Override
    public void register(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (var observer : notificationAlertObservers) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {
        stockCount = stockCount + newStockAdded;
        if (stockCount > 0 && !isAlreadyNotified) {
            isAlreadyNotified = true;
            notifySubscriber();
        }

    }


}
