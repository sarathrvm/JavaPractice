package AbstractFactoryMethod;

public class LuxuryVehicleImpl implements FactoryVehicle{


    @Override
    public Vehicle getVehicle(String name) {
        if(name==""||name.isEmpty()){
            return null;
        }
        switch (name){
            case "Benz":
                return new BenzCar();
            default:
                throw new IllegalArgumentException("input name for luxury vehicle provided is not available");
        }

    }
}
