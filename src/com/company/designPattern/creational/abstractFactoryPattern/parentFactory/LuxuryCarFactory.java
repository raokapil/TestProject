package com.company.designPattern.creational.abstractFactoryPattern.parentFactory;

import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Cars;
import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Luxury;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Cars getInstance(int price) {
        if ( price <= 1000000) {
            return new Luxury();
        } else {
            // another Luxury car factory implementation
            return null;
        }
    }
}
