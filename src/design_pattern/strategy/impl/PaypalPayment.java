package design_pattern.strategy.impl;

import design_pattern.strategy.Payment;

public class PaypalPayment implements Payment {
    @Override
    public void pay(int price) {
        System.out.println(price + " Payment is done by Paypal");
    }
}
