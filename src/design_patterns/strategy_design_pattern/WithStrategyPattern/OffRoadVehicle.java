package design_patterns.strategy_design_pattern.WithStrategyPattern;

import design_patterns.strategy_design_pattern.WithStrategyPattern.strategy.DriveStrategy;
import design_patterns.strategy_design_pattern.WithStrategyPattern.strategy.PowerDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new PowerDriveStrategy());
    }
}
