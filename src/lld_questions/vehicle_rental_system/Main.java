package lld_questions.vehicle_rental_system;

import lld_questions.vehicle_rental_system.enums.Status;
import lld_questions.vehicle_rental_system.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static VehicleRentalSystem rentalSystem;

    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Store> stores = addStores();

        rentalSystem = new VehicleRentalSystem(stores);

        for(int i=0; i<users.size(); i++) {
            User user = users.get(i);
            bookRentReceipt(user, i);
        }
    }

    private static void bookRentReceipt(User user, int i) {
        String location = user.location;
        Store store = rentalSystem.getStore(location);
        if(store==null) {
            System.out.println("Sorry no stores are available at the provided location");
            return;
        }
        VehicleType vehicleType = (i%2==0) ? VehicleType.Bike : VehicleType.Car;
        RentReceipt rentReceipt = store.createRentReceipt(user, vehicleType, i);
        if(rentReceipt != null) System.out.println(rentReceipt);
    }

    private static List<Store> addStores() {
        List<Store> stores = new ArrayList<>();
        String[] locations = {"Mumbai","Delhi"};
        for(int i=0; i<2; i++) {
            stores.add(new Store(addVehicles(locations[i]), locations[i], i));
        }
        return stores;
    }

    private static List<Vehicle> addVehicles(String location) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(VehicleType.Bike, "abcd", 1000, Status.Available));
        vehicles.add(new Vehicle(VehicleType.Car, "hjdh", 2000, Status.Available));
        return vehicles;
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("user1", "dl1", "Mumbai"));
        users.add(new User("user2", "dl2", "Mumbai"));
        users.add(new User("user3", "dl3", "Delhi"));
        users.add(new User("user4", "dl4", "Chennai"));
        users.add(new User("user5", "dl5", "Mumbai"));
        users.add(new User("user6", "dl6", "Mumbai"));
        users.add(new User("user7", "dl7", "Delhi"));
        return users;
    }
}
