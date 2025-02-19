package design_patterns.creational_patterns.builder_design_pattern.cars;

import design_patterns.creational_patterns.builder_design_pattern.components.Engine;
import design_patterns.creational_patterns.builder_design_pattern.components.GPSNavigator;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;

    public Car(CarType carType, int seats, Engine engine, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }
}
