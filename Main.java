package org.example;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(12);

        Shape square = new Square(10);

        System.out.println(square.getShapeName());

        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);




    }
}