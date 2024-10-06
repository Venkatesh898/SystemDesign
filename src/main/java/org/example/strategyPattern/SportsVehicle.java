package org.example.strategyPattern;

import org.example.strategyPattern.strategy.DriveStrategy;
import org.example.strategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends  Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
