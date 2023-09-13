package org.example;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }


}
