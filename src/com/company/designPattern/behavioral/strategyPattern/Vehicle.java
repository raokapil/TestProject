package com.company.designPattern.behavioral.strategyPattern;

import com.company.designPattern.behavioral.strategyPattern.strategy.DriveStrategy;

public abstract class Vehicle {

    DriveStrategy driveStrategy;

    // Constructor Injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    void drive() {
        driveStrategy.drive();
    }
}
