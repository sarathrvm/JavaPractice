package StrategyDesignPattern.VehicleWithStrategyDesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicleObj = new SportsVehicle();

        vehicleObj.drive();


        Vehicle vehicleObj2 = new NormalVehicle();

        vehicleObj2.drive();
    }
}
