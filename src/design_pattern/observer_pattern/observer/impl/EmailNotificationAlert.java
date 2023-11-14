package design_pattern.observer_pattern.observer.impl;

import design_pattern.observer_pattern.observable.StockObservable;
import design_pattern.observer_pattern.observer.NotificationAlertObserver;

public class EmailNotificationAlert implements NotificationAlertObserver {

    private final String email;
    private final StockObservable stockObservable;

    public EmailNotificationAlert(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(email, stockObservable.getStockCount(), "Product is in stock Hurry Up");
    }

    private void sendEmail(String email,Integer stockCount, String s) {
        System.out.println("Email send to "+email + " Stock count "+stockCount +"\n"+ s);
    }
}
