package ParkingLotLLD;

public class ParkingSpot {
    private String id;
    private ParkingVehicle parkingVehicle;
    private boolean isEmpty;
    private int pricePerHour;


    public void parkVehicle(ParkingVehicle vehicle){
        isEmpty =false;
        this.parkingVehicle=vehicle;

    }

    public void removeVehicle(ParkingVehicle vehicle){
        isEmpty=true;
        this.parkingVehicle=null;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public String getId() {
        return id;
    }

    public void setPricePerHour(){
        this.pricePerHour = 10;
    }
}
