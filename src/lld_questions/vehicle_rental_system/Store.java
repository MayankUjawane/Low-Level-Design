package lld_questions.vehicle_rental_system;

import lld_questions.vehicle_rental_system.enums.VehicleType;

import java.util.List;

public class Store {
    VehicleInventoryManger vehicleInventoryManger;
    String location;
    int storeId;

    Store(List<Vehicle> vehicleList, String location, int storeId) {
        vehicleInventoryManger = new VehicleInventoryManger(vehicleList);
        this.location = location;
        this.storeId = storeId;
    }


    public RentReceipt createRentReceipt(User user, VehicleType vehicleType, int receiptNum) {
        Vehicle vehicle = vehicleInventoryManger.rentVehicle(vehicleType);
        if(vehicle==null) {
            System.out.println("Sorry right now no "+vehicleType+" is available at "+user.location);
            return null;
        }
        RentReceipt receipt = new RentReceipt(vehicle, user, storeId, receiptNum);
        return receipt;
    }
}
