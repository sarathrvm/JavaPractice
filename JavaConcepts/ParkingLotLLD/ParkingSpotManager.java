package ParkingLotLLD;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList=new ArrayList<>();

    ParkingSpotManager(List<ParkingSpot> list){
        this.parkingSpotList =list;
    }


    Optional<ParkingSpot> findParkingSpot(){
        return parkingSpotList.stream().filter(ParkingSpot::isEmpty).findFirst();
    }
    void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }
    void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }
    void addVehicle(ParkingVehicle vehicle){

        ParkingSpot parkingSpot = findParkingSpot().get();
        parkingSpot.parkVehicle(vehicle);
    }
    void removeVehicle(ParkingVehicle vehicle){

//        ParkingSpot parkingSpot =

    }
}
