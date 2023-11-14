package design_pattern.abstract_factory_pattern.factory.impl;

import design_pattern.abstract_factory_pattern.factory.CarFactory;
import design_pattern.abstract_factory_pattern.model.Car;
import design_pattern.abstract_factory_pattern.model.impl.Hyundai;
import design_pattern.abstract_factory_pattern.model.impl.Swift;

public class OrdinaryFactory implements CarFactory {
    @Override
    public Car createCar(String stringValue) {

        switch (stringValue) {
            case "HYUNDAI":
                return new Hyundai();

            case "SWIFT":
                return new Swift();

            default:
                throw new RuntimeException("Invalid Runtime Exception");
        }
    }
}
