package lld_questions.parking_lot.parking_spot;

import lld_questions.parking_lot.Vehicle;

public abstract class ParkingSpot {
    int id;
    public boolean isEmpty;
    Vehicle vehicle;
    int price;

    ParkingSpot(int id, int price) {
        this.id = id;
        this.isEmpty = true;
        this.price = price;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getId() {
        return id;
    }
    public abstract int parkingCost();
}
