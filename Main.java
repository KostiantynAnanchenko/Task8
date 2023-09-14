package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(8);

        Shape triangle = new Triangle(10,8,5);

        Shape square = new Square(10);

        Shape rectangle = new Rectangle(12,15);

        ShapePrinter shapePrinter = new ShapePrinter();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (Shape shape : shapes) {
            shapePrinter.printShapeName(shape);
        }





    }
}