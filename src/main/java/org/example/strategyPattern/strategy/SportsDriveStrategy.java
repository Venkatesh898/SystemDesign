package org.example.strategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive capability");
    }
}
