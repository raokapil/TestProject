package com.company.designPattern.creational.abstractFactoryPattern.childFactory;

public class Luxury implements Cars {
    @Override
    public void carName() {
        System.out.println("I'm a driving a Mercedes.");
    }
}
