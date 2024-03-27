package com.company.DependencyInjection;

public class DrawingClass {

    private Shape shape;

    public void getShape() {
        shape.draw();
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
