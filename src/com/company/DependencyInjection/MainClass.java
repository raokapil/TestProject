package com.company.DependencyInjection;

public class MainClass {

    public static void main(String[] args) {

        DrawingClass drawingClass = new DrawingClass();
        drawingClass.setShape(new Circle());
        drawingClass.getShape();
    }
}
