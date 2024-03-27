package com.company.designPattern.creational.builderPattern;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same
 * construction code.
 *
 * It involves a Director, a Builder interface, and Concrete Builders.
 *
 * Example: Building a complex meal with different parts (burger, drink, fries) using a MealBuilder.
 */

// Usage : When need to handle a lot of optional fields in an entity, since to avoid no of constructor
// creation and constructor argument overloading.

// Disadvantage : Duplication of student parameters into studentBuilder class in order to pass into constructor.
// It doesnt support dynamic nature of an object.
public class Main {

    public static void main(String[] args) {


        Director engineeringDirector = new Director(new EngineeringStudentBuilder());
        Director mbaDirector = new Director(new MBAStudentBuilder());

        Student student = engineeringDirector.createStudent();
        Student mbaStudent = mbaDirector.createStudent();

        System.out.println(student.toString());
        System.out.println(mbaStudent.toString());
    }
}
