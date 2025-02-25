package StrategyDesignPattern.VehicleExample.withoutStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive(){
        System.out.println("driving with sports capability");
    }
}
