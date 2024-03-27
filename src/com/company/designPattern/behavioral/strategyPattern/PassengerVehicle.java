package com.company.designPattern.behavioral.strategyPattern;

import com.company.designPattern.behavioral.strategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
