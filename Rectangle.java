package org.example;

public class Rectangle extends Shape{
    private int width;
    private int height;
    private String name = "Rectangle";

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
