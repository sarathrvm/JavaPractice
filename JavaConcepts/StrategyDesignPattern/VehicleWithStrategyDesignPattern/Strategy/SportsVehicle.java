package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveCapability());
    }
}
