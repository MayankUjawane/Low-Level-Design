package lld_questions.vehicle_rental_system;

import java.time.LocalDateTime;

public class RentReceipt {
    Vehicle vehicle;
    LocalDateTime bookingTime;
    User user;
    int storeId;
    int receiptNum;

    RentReceipt(Vehicle vehicle, User user, int storeId, int recepitNum) {
        this.vehicle = vehicle;
        this.bookingTime = LocalDateTime.now();
        this.user = user;
        this.storeId = storeId;
        this.receiptNum = recepitNum;
    }

    @Override
    public String toString() {
        return bookingTime+", vehicleType = "+vehicle.vehicleType+", userName = "+user.name+", storeId = "+storeId+", receiptNum = "+ receiptNum;
    }
}
