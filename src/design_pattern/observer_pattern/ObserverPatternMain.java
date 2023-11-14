package design_pattern.observer_pattern;

import design_pattern.observer_pattern.observable.StockObservable;
import design_pattern.observer_pattern.observable.impl.IphoneObservable;
import design_pattern.observer_pattern.observer.NotificationAlertObserver;
import design_pattern.observer_pattern.observer.impl.EmailNotificationAlert;

public class ObserverPatternMain {

    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservable();
        NotificationAlertObserver observer1 = new EmailNotificationAlert("hello@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlert("hello1@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailNotificationAlert("hello2@gmail.com", iphoneObservable);
        NotificationAlertObserver observer4 = new EmailNotificationAlert("hello3@gmail.com", iphoneObservable);
        NotificationAlertObserver observer5 = new EmailNotificationAlert("hello4@gmail.com", iphoneObservable);

        iphoneObservable.register(observer1);
        iphoneObservable.register(observer2);
        iphoneObservable.register(observer3);
        iphoneObservable.register(observer4);
        iphoneObservable.register(observer5);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(10);

    }
}
