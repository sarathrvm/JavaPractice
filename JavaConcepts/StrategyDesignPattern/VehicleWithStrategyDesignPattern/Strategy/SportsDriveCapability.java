package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class SportsDriveCapability implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("driving with Sports capability");
    }
}
