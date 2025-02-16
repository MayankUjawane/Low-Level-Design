package design_patterns.behavioral_patterns.null_object_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicleObject("Car");
        printVehicle(car);
        Vehicle bike = VehicleFactory.getVehicleObject("Bike");
        printVehicle(bike);
        Vehicle truck = VehicleFactory.getVehicleObject("Truck");
        printVehicle(truck);
    }

    private static void printVehicle(Vehicle vehicle) {
        System.out.println("Fuel Tank Capacity: "+ vehicle.getFuelTankCapacity());
        System.out.println("Number of Sitting: "+ vehicle.getNumberOfSiting());
    }
}
