package com.company.designPattern.creational.prototypePattern;

// Prototype is a creational design pattern that lets you copy existing objects without making your
// code dependent on their classes.

/**
 * Use Case : When creation of object to be cloned is very expensive, and we have to create multiple objects
 * then we can clone objects and do some minor changes in cloned objects as per req.
 *
 * problems solved by :
 *
 * 1) We can't copy private members of an object through assigning outside the class
 * 2) Also, need to know beforehand the variables to copy from the object to be cloned.
 *
 * Solution by prototype :
 * cloning responsibility is to be of class itself.
 * Prototype interface helps to provide consistency in method name else subclass have their own desired name
 * like clone, doClone, getClone, etc.
 */
public class Main {

    public static void main (String[] args) {

        Student student = new Student("XYZ", 1);
        Student student2 = (Student) student.clone();
        System.out.println(student2);
    }
}
