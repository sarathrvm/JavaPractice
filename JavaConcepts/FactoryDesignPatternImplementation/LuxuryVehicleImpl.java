package FactoryDesignPatternImplementation;

public class LuxuryVehicleImpl implements VehicleTypeInterface{
    @Override
    public Vehicle getVehicleName(String vehicleName) {

        if(vehicleName=="benz"){
            return new BenzLuxuryVehicle();
        }
        return null;
    }
}
