package design_pattern.factory_pattern.impl;

import design_pattern.factory_pattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}
