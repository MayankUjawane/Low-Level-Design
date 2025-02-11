package lld_questions.parking_lot;

import lld_questions.parking_lot.enums.VehicleType;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;
    Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
