package design_patterns.strategy_design_pattern.WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle offRoad = new OffRoadVehicle();
        offRoad.drive();
        Vehicle passenger = new PassengerVehicle();
        passenger.drive();
        Vehicle sports = new SportsVechicle();
        sports.drive();
    }
}
