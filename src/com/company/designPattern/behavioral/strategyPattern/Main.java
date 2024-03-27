package com.company.designPattern.behavioral.strategyPattern;

/**
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them
 * into a separate class, and make their objects interchangeable.
 *
 * Pros :
 *
 *  You can swap algorithms used inside an object at runtime.
 *
 *  You can isolate the implementation details of an algorithm from the code that uses it.
 *
 *  You can replace inheritance with composition.
 *
 *  Open/Closed Principle. You can introduce new strategies without having to change the context.
 *
 *
 * Implementation : Key components of the Strategy pattern include:
 *
 * Strategy Interface/Abstract Class: This defines an interface or abstract class that represents the
 * algorithm to be used. Each concrete strategy class implements this interface.
 *
 * Concrete Strategies: These are the concrete classes that implement the Strategy interface, each
 * providing a specific algorithm.
 *
 * Context: This is the class that uses the strategy objects. It has a reference to the Strategy
 * interface and can switch between different strategies at runtime.
 *
 * Use Case: Payment Processing in an E-commerce System
 */
// Case : To be used when there is inheritance relationship, and child's having same code in their methods
//        which is not present in parent.
public class Main {

    public static void main(String args[]) {

        Vehicle vehicle = new SUVVehicle();
        vehicle.drive();
    }
}
