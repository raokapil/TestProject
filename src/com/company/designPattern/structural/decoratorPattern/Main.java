package com.company.designPattern.structural.decoratorPattern;

import com.company.designPattern.structural.decoratorPattern.base.ExtraCheeseToppings;
import com.company.designPattern.structural.decoratorPattern.base.MushroomToppings;
import com.company.designPattern.structural.decoratorPattern.base.VegDelightPizza;

/**
 * Decorator is a structural design pattern that lets you attach new behaviors to objects by placing
 * these objects inside special wrapper objects that contain the behaviors.
 *
 * Pros :
 *
 *  You can extend an object’s behavior without making a new subclass.
 *
 *  You can add or remove responsibilities from an object at runtime.
 *
 *  You can combine several behaviors by wrapping an object into multiple decorators.
 *
 *  Single Responsibility Principle. You can divide a monolithic class that implements many possible
 *  variants of behavior into several smaller classes.
 */
// Structural Design pattern : helps in creating structure of complex objects.

// Use Case for class explosion like to handle multiple layers of class
// When a class need to handle both IS-A and HAS-A relationship in a single class
// For ex: Pizza toppings, Coffee machine, etc.
public class Main {

    public static void main(String[] args) {

        ExtraCheeseToppings basePizza = new ExtraCheeseToppings(new MushroomToppings(new VegDelightPizza()));
        System.out.println(basePizza.cost());
    }
}
