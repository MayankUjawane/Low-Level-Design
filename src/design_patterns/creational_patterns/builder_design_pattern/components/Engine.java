package design_patterns.creational_patterns.builder_design_pattern.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }
}
