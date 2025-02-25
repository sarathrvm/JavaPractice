package AbstractFactoryMethod;

public class OrdinaryVehicleImpl implements FactoryVehicle{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if(vehicleName==null ||vehicleName.isEmpty()){
            return null;
        }
        switch (vehicleName){
            case "swift":
                return new SwiftCar();
            default:
                throw new IllegalArgumentException("given input vehicle name is not available");
        }

    }

}
