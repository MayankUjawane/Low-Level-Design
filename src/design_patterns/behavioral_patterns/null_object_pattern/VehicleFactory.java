package design_patterns.behavioral_patterns.null_object_pattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String typeOfVehicle) {
        switch (typeOfVehicle) {
            case "Bike":
                return new Bike();
            case "Car":
                return new Car();
            default:
                return new NullVehicle();
        }
    }
}
