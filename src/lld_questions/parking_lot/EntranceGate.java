package lld_questions.parking_lot;

import lld_questions.parking_lot.parking_spot.FourWheelerParkingSpot;
import lld_questions.parking_lot.parking_spot.ParkingSpot;
import lld_questions.parking_lot.parking_spot.TwoWheelerParkingSpot;
import lld_questions.parking_lot.parking_spot_manager.FourWheelerParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.ParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.TwoWheelerParkingSpotManager;

import java.util.ArrayList;

public class EntranceGate {
    ParkingSpotManager twoWheelerParkingSpotManager, fourWheelerParkingSpotManager;
    EntranceGate() {
        init();
    }
    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = getParkingSpotManager(vehicle);
        ParkingSpot parkingSpot = parkingSpotManager.parkVehicle(vehicle);
        if(parkingSpot == null) return null;
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        return ticket;
    }

    private void init() {
        twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(new ArrayList<>());
        for(int i=0; i<3; i++) twoWheelerParkingSpotManager.addParkingSpot(new TwoWheelerParkingSpot(i));

        fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(new ArrayList<>());
        for(int i=0; i<3; i++) fourWheelerParkingSpotManager.addParkingSpot(new FourWheelerParkingSpot(i));
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
