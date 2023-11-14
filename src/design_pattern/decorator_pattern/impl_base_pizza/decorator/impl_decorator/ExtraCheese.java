package design_pattern.decorator_pattern.impl_base_pizza.decorator.impl_decorator;

import design_pattern.decorator_pattern.BasePizza;
import design_pattern.decorator_pattern.impl_base_pizza.decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
