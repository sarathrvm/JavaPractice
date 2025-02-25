package AbstractFactoryMethod;

public class SpeedOfGivenVehicleMain {
    public static void main(String[] args) {
        FactoryGetVehicleType factoryGetVehicleType= new FactoryGetVehicleType();

        FactoryVehicle factoryVehicle = factoryGetVehicleType.getVehicleType("Luxury");

        Vehicle vehicle = factoryVehicle.getVehicle("Benz");

        vehicle.averageSpeed();
    }
}
