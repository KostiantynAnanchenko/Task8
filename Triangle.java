package org.example;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;
    private String name = "Triangle";

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getShapeName() {
        return name;
    }

}
