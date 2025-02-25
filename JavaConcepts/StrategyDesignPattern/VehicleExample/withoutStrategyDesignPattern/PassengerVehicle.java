package StrategyDesignPattern.VehicleExample.withoutStrategyDesignPattern;

public class PassengerVehicle extends Vehicle{


    @Override
    public void drive(){
        System.out.println("driving with normal capability");
    }
}
