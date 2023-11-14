package design_pattern.abstract_factory_pattern.abstract_factory;

import design_pattern.abstract_factory_pattern.factory.CarFactory;
import design_pattern.abstract_factory_pattern.factory.impl.LuxuryFactory;
import design_pattern.abstract_factory_pattern.factory.impl.OrdinaryFactory;

public class CarAbstractFactory {

    public static CarFactory getCarFactory(String factory) {

        switch (factory) {
            case "LUXURY":
                return new LuxuryFactory();

            case "ORDINARY":
                return new OrdinaryFactory();

            default:
                throw new RuntimeException("Invalid Argument");
        }
    }
}
