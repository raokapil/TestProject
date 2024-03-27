package com.company.designPattern.creational.abstractFactoryPattern.parentFactory;

import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Cars;
import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Economy;

public class EconomyCarfactory implements AbstractFactory {
    @Override
    public Cars getInstance(int price) {

        if (price <= 500000) {
            return new Economy();
        } else {
            // Some other economy car class implementation
            return null;
        }

    }
}
