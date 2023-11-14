package design_pattern.strategy.impl;

import design_pattern.strategy.Payment;

public class UpiPayment implements Payment {
    @Override
    public void pay(int price) {
        System.out.println(price + " Payment is done by UPI");
    }
}
