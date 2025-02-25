package FactoryDesignPatternImplementation;

public class VehicleType {

    private String vehicleType;

    public VehicleTypeInterface getVehicleType(String vehicleType){

        if(vehicleType=="luxury"){
            return new LuxuryVehicleImpl();
        }
        else if (vehicleType=="ordinary"){
            return new OrdinaryVehicleImpl();
        }

        return null;

    }
}
