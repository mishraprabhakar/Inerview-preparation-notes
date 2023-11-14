package design_pattern.abstract_factory_pattern.factory.impl;

import design_pattern.abstract_factory_pattern.factory.CarFactory;
import design_pattern.abstract_factory_pattern.model.Car;
import design_pattern.abstract_factory_pattern.model.impl.Mercedes;
import design_pattern.abstract_factory_pattern.model.impl.Ody;

public class LuxuryFactory implements CarFactory {
    @Override
    public Car createCar(String stringValue) {

        switch(stringValue) {
            case "MERCEDES":
                return new Mercedes();

            case "ODY":
                return new Ody();

            default:
                throw new RuntimeException("Invalid Runtime Exception");
        }
    }
}
