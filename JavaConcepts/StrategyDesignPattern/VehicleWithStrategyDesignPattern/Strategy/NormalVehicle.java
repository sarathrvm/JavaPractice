package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDriveCapability());
    }
}
