package design_pattern.abstract_factory_pattern.model.impl;

import design_pattern.abstract_factory_pattern.model.Car;

public class Hyundai extends Car {
    @Override
    public void display() {
        System.out.println("Hyundai Car");
    }
}
