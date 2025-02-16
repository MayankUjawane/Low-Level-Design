package design_patterns.behavioral_patterns.null_object_pattern;

public class NullVehicle implements Vehicle {
    @Override
    public int getNumberOfSiting() {
        return -1;
    }

    @Override
    public int getFuelTankCapacity() {
        return -1;
    }
}
