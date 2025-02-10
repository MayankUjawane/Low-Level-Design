package design_patterns.behavioral_patterns.strategy_design_pattern.WithStrategyPattern;

import design_patterns.behavioral_patterns.strategy_design_pattern.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
