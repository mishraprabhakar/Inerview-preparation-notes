package design_pattern.decorator_pattern.impl_base_pizza;

import design_pattern.decorator_pattern.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
