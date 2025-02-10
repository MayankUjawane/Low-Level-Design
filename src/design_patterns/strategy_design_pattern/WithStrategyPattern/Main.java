package design_patterns.strategy_design_pattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle passenger = new PassengerVehicle();
        passenger.drive();
        Vehicle offRoad = new OffRoadVehicle();
        offRoad.drive();
        Vehicle sports = new SportsVehicle();
        sports.drive();
    }
}
