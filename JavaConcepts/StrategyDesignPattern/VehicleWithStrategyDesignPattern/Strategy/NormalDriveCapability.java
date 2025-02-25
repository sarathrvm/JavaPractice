package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class NormalDriveCapability implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving with Normal Compatability");
    }
}
