package lld_questions.vehicle_rental_system;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    public VehicleRentalSystem(List<Store> stores) {
        this.stores = stores;
    }

    public Store getStore(String location) {
        for(Store store : stores) {
            if(store.location.equals(location)) return store;
        }
        return null;
    }
}
