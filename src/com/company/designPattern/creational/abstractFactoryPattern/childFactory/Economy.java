package com.company.designPattern.creational.abstractFactoryPattern.childFactory;

public class Economy implements Cars {
    @Override
    public void carName() {
        System.out.println("I'm driving a BMW");
    }
}
