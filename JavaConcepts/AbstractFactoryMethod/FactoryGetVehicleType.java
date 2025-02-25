package AbstractFactoryMethod;

public class FactoryGetVehicleType {
   public FactoryVehicle getVehicleType(String vehicleType){
        if(vehicleType==null || vehicleType.isEmpty()){
            return null;
        }
        switch (vehicleType){
            case "Ordinary":
                return new OrdinaryVehicleImpl();
            case "Luxury":
                return new LuxuryVehicleImpl();
            default:
                throw new IllegalArgumentException("vehicle type provided is not available");
        }
    }
}
