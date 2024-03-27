package com.company.designPattern.creational.factoryPattern;

// The factory method pattern loosens the coupling code by separating our Product‘s construction code
// from the code that uses this Product.

// To manage object creation on the basis of condition, specially in case of large codebase.

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects,
 * but allows subclasses to alter the type of objects that will be created.
 *
 * Pros :
 *
 * You avoid tight coupling between the creator and the concrete products.
 *
 * Single Responsibility Principle : You can move the product creation code into one place in the program,
 *  making the code easier to support.
 *
 * Open/Closed Principle : You can introduce new types of products into the program without breaking
 *  existing client code.
 *
 */


public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
/**
 *
 * Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing
 * code.
 *
 * Structural patterns explain how to assemble objects and classes into larger structures, while keeping
 * these structures flexible and efficient.
 *
 * Behavioral patterns take care of effective communication and the assignment of responsibilities between
 * objects.
 *
 */