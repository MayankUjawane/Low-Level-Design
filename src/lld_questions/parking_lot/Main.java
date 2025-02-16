package lld_questions.parking_lot;

import lld_questions.parking_lot.enums.VehicleType;
import lld_questions.parking_lot.parking_spot.FourWheelerParkingSpot;
import lld_questions.parking_lot.parking_spot.TwoWheelerParkingSpot;
import lld_questions.parking_lot.parking_spot_manager.FourWheelerParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.ParkingSpotManager;
import lld_questions.parking_lot.parking_spot_manager.TwoWheelerParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingSpotManager twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(new ArrayList<>());
        ParkingSpotManager fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(new ArrayList<>());
        initParkingSpotManagers(twoWheelerParkingSpotManager, fourWheelerParkingSpotManager);

        EntranceGate entranceGate = new EntranceGate(twoWheelerParkingSpotManager, fourWheelerParkingSpotManager);

        List<Ticket> parkingTickets = new ArrayList<>();

        System.out.println("\"Parking Two Wheelers\"");
        parkTwoWheelers(parkingTickets, entranceGate);

        System.out.println("\"Parking Four Wheelers\"");
        parkFourWheelers(parkingTickets, entranceGate);

        System.out.println("\"Un-Parking all the Vehicles\"");
        // Mark un-park to the parking slots
        for(Ticket parkingTicket : parkingTickets) {
            // doing directly here, in place of using parkingSpotManagers directly we should use separate class exitGate for this
            // un-parking parking slots. We can add charge logic also in exitGate class
            if(parkingTicket.vehicle.vehicleType.equals(VehicleType.FourWheeler)) {
                fourWheelerParkingSpotManager.unparkVehicle(parkingTicket.parkingSpot);
            } else if(parkingTicket.vehicle.vehicleType.equals(VehicleType.TwoWheeler)) {
                twoWheelerParkingSpotManager.unparkVehicle(parkingTicket.parkingSpot);
            }
        }
    }

    private static void parkTwoWheelers(List<Ticket> parkingTickets, EntranceGate entranceGate) {
        List<Vehicle> twoWheeler = new ArrayList<>();
        for(int i=0; i<4; i++) twoWheeler.add(new Vehicle("i", VehicleType.TwoWheeler));
        // adding two-wheelers for parking and generating parking ticket for them
        for(Vehicle vehicle : twoWheeler) {
            Ticket ticket = entranceGate.generateTicket(vehicle);
            if(ticket == null) {
                System.out.println("No Parking Space Available");
            } else {
                parkingTickets.add(ticket);
                System.out.println(ticket);
            }
        }
    }
    private static void parkFourWheelers(List<Ticket> parkingTickets, EntranceGate entranceGate) {
        List<Vehicle> fourWheeler = new ArrayList<>();
        for(int i=0; i<4; i++) fourWheeler.add(new Vehicle("i", VehicleType.FourWheeler));
        // adding four wheelers for parking and generating parking ticket for them
        for(Vehicle vehicle : fourWheeler) {
            Ticket ticket = entranceGate.generateTicket(vehicle);
            if(ticket == null) {
                System.out.println("No Parking Space Available");
            } else {
                parkingTickets.add(ticket);
                System.out.println(ticket);
            }
        }
    }
    private static void initParkingSpotManagers(ParkingSpotManager twoWheelerParkingSpotManager, ParkingSpotManager fourWheelerParkingSpotManager) {
        for(int i=0; i<3; i++) twoWheelerParkingSpotManager.addParkingSpot(new TwoWheelerParkingSpot(i));
        for(int i=0; i<3; i++) fourWheelerParkingSpotManager.addParkingSpot(new FourWheelerParkingSpot(i));
    }
}
