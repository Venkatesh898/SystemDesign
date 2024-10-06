package org.example.strategyPattern;

import org.example.strategyPattern.strategy.DriveStrategy;
import org.example.strategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends  Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
