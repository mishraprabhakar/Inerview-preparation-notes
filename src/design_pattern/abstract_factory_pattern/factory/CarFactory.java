package design_pattern.abstract_factory_pattern.factory;

import design_pattern.abstract_factory_pattern.model.Car;

public interface CarFactory {

    Car createCar(String stringValue);
}
