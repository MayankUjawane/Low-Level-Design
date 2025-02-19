package design_patterns.creational_patterns.builder_design_pattern.builders;

import design_patterns.creational_patterns.builder_design_pattern.cars.Car;
import design_patterns.creational_patterns.builder_design_pattern.cars.CarType;
import design_patterns.creational_patterns.builder_design_pattern.components.Engine;
import design_patterns.creational_patterns.builder_design_pattern.components.GPSNavigator;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
