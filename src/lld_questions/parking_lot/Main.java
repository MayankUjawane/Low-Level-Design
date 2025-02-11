package lld_questions.parking_lot;

import lld_questions.parking_lot.parking_spot_manager.FourWheelerParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.ParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.TwoWheelerParkingSpotManager;
import lld_questions.parking_lot.parking_spot.*;
import lld_questions.parking_lot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntranceGate entranceGate = new EntranceGate();

        List<Vehicle> twoWheeler = new ArrayList<>();
        for(int i=0; i<4; i++) twoWheeler.add(new Vehicle("i", VehicleType.TwoWheeler));
        for(Vehicle vehicle : twoWheeler) {
            Ticket ticket = entranceGate.generateTicket(vehicle);
            if(ticket == null) {
                System.out.println("No Parking Space Available");
            } else {
                System.out.println(ticket);
            }
        }

        List<Vehicle> fourWheeler = new ArrayList<>();
        for(int i=0; i<4; i++) fourWheeler.add(new Vehicle("i", VehicleType.FourWheeler));
        for(Vehicle vehicle : fourWheeler) {
            Ticket ticket = entranceGate.generateTicket(vehicle);
            if(ticket == null) {
                System.out.println("No Parking Space Available");
            } else {
                System.out.println(ticket);
            }
        }
    }
}
