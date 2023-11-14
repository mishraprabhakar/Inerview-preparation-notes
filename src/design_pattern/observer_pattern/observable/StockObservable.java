package design_pattern.observer_pattern.observable;

import design_pattern.observer_pattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void register(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
