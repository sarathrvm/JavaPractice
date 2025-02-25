package FactoryDesignPatternImplementation;

public class OrdinaryVehicleImpl implements VehicleTypeInterface{
    @Override
    public Vehicle getVehicleName(String vehicleName) {
        if(vehicleName=="swift"){
            return new SwiftOrdinaryVehicle();
        }
        return null;
    }
}
