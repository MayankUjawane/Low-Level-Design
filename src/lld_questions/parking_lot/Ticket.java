package lld_questions.parking_lot;

import lld_questions.parking_lot.parking_spot.ParkingSpot;

import java.time.LocalDateTime;

public class Ticket {
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    int parkingCost;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        entryTime = LocalDateTime.now();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        parkingCost = parkingSpot.parkingCost();
    }

    @Override
    public String toString() {
        return entryTime+" "+vehicle.vehicleType+" "+parkingSpot.getId()+" "+parkingCost;
    }
}
