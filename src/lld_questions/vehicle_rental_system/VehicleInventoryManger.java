package lld_questions.vehicle_rental_system;

import lld_questions.vehicle_rental_system.enums.Status;
import lld_questions.vehicle_rental_system.enums.VehicleType;

import java.util.List;

public class VehicleInventoryManger {
    List<Vehicle> vehicleList;

    public VehicleInventoryManger(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle rentVehicle(VehicleType vehicleType) {
        for(Vehicle vehicle : vehicleList) {
            if(vehicle.status == Status.Available && vehicle.vehicleType == vehicleType) {
                vehicle.status = Status.NotAvailable;
                return vehicle;
            }
        }
        return null;
    }

    public void markVehicleAvailable(Vehicle vehicle) {
        for(Vehicle currVehicle : vehicleList) {
            if(vehicle.vehicleNumber.equals(currVehicle.vehicleNumber)) {
                currVehicle.status = Status.Available;
                break;
            }
        }
    }

    public void add(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }
}
