package com.company.designPattern.creational.abstractFactoryPattern.parentFactory;

import com.company.designPattern.creational.abstractFactoryPattern.childFactory.Cars;

public interface AbstractFactory {

    Cars getInstance(int price);
}
