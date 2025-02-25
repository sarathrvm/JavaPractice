package ParkingLotLLD;

public class FourWheelerParkingSpot extends ParkingSpot{

    private int pricePerHour;

    @Override
    public void setPricePerHour(){
        this.pricePerHour = 20;
    }
}
