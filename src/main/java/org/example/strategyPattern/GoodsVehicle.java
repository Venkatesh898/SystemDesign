package org.example.strategyPattern;

import org.example.strategyPattern.strategy.DriveStrategy;
import org.example.strategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends  Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
