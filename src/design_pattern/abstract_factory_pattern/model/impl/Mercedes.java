package design_pattern.abstract_factory_pattern.model.impl;

import design_pattern.abstract_factory_pattern.model.Car;

public class Mercedes extends Car {
    @Override
    public void display() {
        System.out.println("Mercedes car");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
