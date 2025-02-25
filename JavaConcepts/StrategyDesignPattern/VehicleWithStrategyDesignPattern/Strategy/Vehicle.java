package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy driveObj){
        this.driveStrategyObj =driveObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
