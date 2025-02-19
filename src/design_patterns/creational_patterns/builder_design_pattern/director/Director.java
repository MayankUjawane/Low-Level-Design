package design_patterns.creational_patterns.builder_design_pattern.director;

import design_patterns.creational_patterns.builder_design_pattern.builders.Builder;
import design_patterns.creational_patterns.builder_design_pattern.cars.CarType;
import design_patterns.creational_patterns.builder_design_pattern.components.Engine;
import design_patterns.creational_patterns.builder_design_pattern.components.GPSNavigator;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
            .setSeats(2)
            .setEngine(new Engine(3.0, 0))
            .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR)
            .setSeats(2)
            .setEngine(new Engine(1.2, 0))
            .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV)
            .setSeats(5)
            .setEngine(new Engine(2.5, 0))
            .setGPSNavigator(new GPSNavigator());
    }
}
