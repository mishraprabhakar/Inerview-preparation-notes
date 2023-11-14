package design_pattern.strategy;

import design_pattern.strategy.entity.Item;
import design_pattern.strategy.impl.PaypalPayment;
import design_pattern.strategy.impl.UpiPayment;
import design_pattern.strategy.service.ShoppingCart;

public class StrategyPattern {


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("123", 10));
        cart.addItem(new Item("435", 20));

        //Now we are giving control to client to enter the object type of either PayPal or UPI
        cart.pay(new PaypalPayment());
        cart.pay(new UpiPayment());
    }
}
