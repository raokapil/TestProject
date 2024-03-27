package com.company.designPattern.behavioral.strategyPattern;

import com.company.designPattern.behavioral.strategyPattern.strategy.SportsDriveStrategy;

public class SUVVehicle extends Vehicle{

    SUVVehicle() {
        super(new SportsDriveStrategy());
    }
}
