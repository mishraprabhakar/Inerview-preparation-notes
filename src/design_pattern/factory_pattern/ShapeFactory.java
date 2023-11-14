package design_pattern.factory_pattern;

import design_pattern.factory_pattern.impl.Circle;
import design_pattern.factory_pattern.impl.Rectangle;
import design_pattern.factory_pattern.impl.Square;

public class ShapeFactory {

    Shape getShape(String inputString) {

        switch (inputString) {
            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                return null;
        }
    }


}
