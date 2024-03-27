package com.company.designPattern.behavioral.strategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy");
    }
}
