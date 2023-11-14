package design_pattern.abstract_factory_pattern;

import design_pattern.abstract_factory_pattern.abstract_factory.CarAbstractFactory;
import design_pattern.abstract_factory_pattern.model.Car;

public class CarAbstractFactoryMain {

    public static void main(String[] args) {

        Car car = CarAbstractFactory.getCarFactory("LUXURY").createCar("MERCEDES");
        car.display();
    }
}
