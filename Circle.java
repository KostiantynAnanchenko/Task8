package org.example;

class Circle extends Shape {
    private int radius;
    private String name = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
