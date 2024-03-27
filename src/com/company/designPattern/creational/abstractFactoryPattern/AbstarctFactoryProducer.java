package com.company.designPattern.creational.abstractFactoryPattern;

import com.company.designPattern.creational.abstractFactoryPattern.parentFactory.AbstractFactory;
import com.company.designPattern.creational.abstractFactoryPattern.parentFactory.EconomyCarfactory;
import com.company.designPattern.creational.abstractFactoryPattern.parentFactory.LuxuryCarFactory;

public class AbstarctFactoryProducer {

    public AbstractFactory getFactoryInstance(String value) {
        if (value.equals("Economy")) {
            return new EconomyCarfactory();
        } else {
            return new LuxuryCarFactory();
        }
    }
}
