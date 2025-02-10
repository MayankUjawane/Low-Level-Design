package design_patterns.strategy_design_pattern.WithStrategyPattern.strategy;

public class PowerDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Power Drive Capability");
    }
}
