package design_patterns.behavioral_patterns.null_object_pattern;

public class Car implements Vehicle {
    @Override
    public int getNumberOfSiting() {
        return 7;
    }

    @Override
    public int getFuelTankCapacity() {
        return 45;
    }
}
