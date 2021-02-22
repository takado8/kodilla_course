package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    void addFigure(Shape shape) {
        shapes.add(shape);
    }

    void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    Shape getFigure(int n) {
        if (shapes.size() > n)
            return shapes.get(n);
        else return null;
    }

    String showFigures() {
        if (shapes.size() > 0) {
            String figures = "";
            for (var figure : shapes) {
                figures += figure.getShapeName() + ", ";
            }
            return "[" + figures.substring(0, figures.length() - 2) + "]";
        }
        else return "[]";
    }

    public int getSize() {
        return shapes.size();
    }

}
