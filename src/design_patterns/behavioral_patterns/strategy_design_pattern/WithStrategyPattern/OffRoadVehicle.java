package design_patterns.behavioral_patterns.strategy_design_pattern.WithStrategyPattern;

import design_patterns.behavioral_patterns.strategy_design_pattern.WithStrategyPattern.strategy.PowerDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new PowerDriveStrategy());
    }
}
