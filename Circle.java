package org.example;

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
