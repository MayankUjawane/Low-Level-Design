package lld_questions.parking_lot.parking_spot_manager;

import lld_questions.parking_lot.Vehicle;
import lld_questions.parking_lot.parking_spot.ParkingSpot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> list) {
        this.parkingSpotList = list;
    }

    private ParkingSpot findParkingSpot() {
        for(ParkingSpot parkingSpot : parkingSpotList) {
            if(parkingSpot.isEmpty) return parkingSpot;
        }
        return null;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot parking = findParkingSpot();
        if(parking == null) return null;
        parking.parkVehicle(vehicle);
        return parking;
    }

    public void unparkVehicle(ParkingSpot parkingSpot) {
        for(ParkingSpot currParkingSpot: parkingSpotList) {
            if(parkingSpot.getId() == currParkingSpot.getId()) {
                currParkingSpot.unParkVehicle();
            }
        }
    }
}
