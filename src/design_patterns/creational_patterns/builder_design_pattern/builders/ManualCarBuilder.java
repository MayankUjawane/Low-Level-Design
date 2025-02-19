package design_patterns.creational_patterns.builder_design_pattern.builders;

import design_patterns.creational_patterns.builder_design_pattern.cars.CarType;
import design_patterns.creational_patterns.builder_design_pattern.cars.Manual;
import design_patterns.creational_patterns.builder_design_pattern.components.Engine;
import design_patterns.creational_patterns.builder_design_pattern.components.GPSNavigator;

public class ManualCarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;

    @Override
    public Builder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, gpsNavigator);
    }
}
