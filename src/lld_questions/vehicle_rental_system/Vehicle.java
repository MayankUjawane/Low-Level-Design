package lld_questions.vehicle_rental_system;

import lld_questions.vehicle_rental_system.enums.Status;
import lld_questions.vehicle_rental_system.enums.VehicleType;

public class Vehicle {
    VehicleType vehicleType;
    String vehicleNumber;
    int rentCost;
    Status status;

    public Vehicle(VehicleType vehicleType, String vehicleNumber, int rentCost, Status status) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.rentCost = rentCost;
        this.status = status;
    }
}
