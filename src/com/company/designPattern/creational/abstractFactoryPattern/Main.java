package com.company.designPattern.creational.abstractFactoryPattern;

import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Cars;
import com.company.designPattern.creational.abstractFactoryPattern.parentFactory.AbstractFactory;

// Our first factory ll return list of products.
// https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
public class Main {

    public static void main(String[] args) {

        AbstarctFactoryProducer abstarctFactoryProducer = new AbstarctFactoryProducer();
        AbstractFactory abstractFactory = abstarctFactoryProducer.getFactoryInstance("Economy");
        Cars cars = abstractFactory.getInstance(200000);
        cars.carName();
    }
}
