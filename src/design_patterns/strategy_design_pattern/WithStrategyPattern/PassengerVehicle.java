package design_patterns.strategy_design_pattern.WithStrategyPattern;

import design_patterns.strategy_design_pattern.WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
