package design_pattern.decorator_pattern;

import design_pattern.decorator_pattern.impl_base_pizza.Margherita;
import design_pattern.decorator_pattern.impl_base_pizza.decorator.impl_decorator.ExtraCheese;
import design_pattern.decorator_pattern.impl_base_pizza.decorator.impl_decorator.Mushroom;

public class DecoratorPatternMain {
    public static void main(String[] args) {

        BasePizza margheritaWithSomeExtraMushroom = new Mushroom(new Margherita());
        int cost = margheritaWithSomeExtraMushroom.cost();
        System.out.println("Margherita With Some Extra Mushroom Cost : " +cost);

        BasePizza margheritaWithSomeExtraMushroomAndExtraCheese = new ExtraCheese(new Mushroom(new Margherita()));
        int cost1 = margheritaWithSomeExtraMushroomAndExtraCheese.cost();
        System.out.println("Margherita With Some Extra Mushroom and Cheese Cost : " +cost1);
    }
}
