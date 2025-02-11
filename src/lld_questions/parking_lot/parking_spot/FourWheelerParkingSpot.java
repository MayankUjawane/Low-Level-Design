package lld_questions.parking_lot.parking_spot;

public class FourWheelerParkingSpot extends ParkingSpot {

    public FourWheelerParkingSpot(int id) {
        super(id, 20);
    }

    @Override
    public int parkingCost() {
        return this.price;
    }
}
