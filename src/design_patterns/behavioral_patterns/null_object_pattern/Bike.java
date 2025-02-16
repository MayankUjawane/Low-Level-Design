package design_patterns.behavioral_patterns.null_object_pattern;

public class Bike implements Vehicle {
    @Override
    public int getNumberOfSiting() {
        return 2;
    }

    @Override
    public int getFuelTankCapacity() {
        return 10;
    }
}
