package com.kodilla.testing.shape;

public class Circle implements Shape{
    private final String shapeName;
    private final double field;

    public Circle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }
}
