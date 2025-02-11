package lld_questions.parking_lot.parking_spot;

public class TwoWheelerParkingSpot extends ParkingSpot {

    public TwoWheelerParkingSpot(int id) {
        super(id, 10);
    }

    @Override
    public int parkingCost() {
        return this.price;
    }
}
