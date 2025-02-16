package lld_questions.parking_lot;

import lld_questions.parking_lot.parking_spot.ParkingSpot;
import lld_questions.parking_lot.parking_spot_manager.ParkingSpotManager;

public class EntranceGate {
    ParkingSpotManager twoWheelerParkingSpotManager, fourWheelerParkingSpotManager;
    EntranceGate(ParkingSpotManager twoWheelerParkingSpotManager, ParkingSpotManager fourWheelerParkingSpotManager) {
        this.twoWheelerParkingSpotManager = twoWheelerParkingSpotManager;
        this.fourWheelerParkingSpotManager = fourWheelerParkingSpotManager;
    }
    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = getParkingSpotManager(vehicle);
        ParkingSpot parkingSpot = parkingSpotManager.parkVehicle(vehicle);
        if(parkingSpot == null) return null;
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        return ticket;
    }

    private ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = null;
        switch (vehicle.vehicleType) {
            case TwoWheeler:
                parkingSpotManager = twoWheelerParkingSpotManager;
                break;
            case FourWheeler:
                parkingSpotManager = fourWheelerParkingSpotManager;
                break;
        }
        return parkingSpotManager;
    }
}
