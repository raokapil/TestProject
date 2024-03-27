package com.company.designPattern.behavioral.strategyPattern.strategy;

public class OffRoadStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("OffRoad drive strategy");
    }
}
