package org.example.strategyPattern;

import org.example.strategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public  Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy=driveStrategy;
    }
    public void drive()
    {
        driveStrategy.drive();
    }
}
