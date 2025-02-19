package design_patterns.creational_patterns.builder_design_pattern;

import design_patterns.creational_patterns.builder_design_pattern.builders.CarBuilder;
import design_patterns.creational_patterns.builder_design_pattern.builders.ManualCarBuilder;
import design_patterns.creational_patterns.builder_design_pattern.cars.Car;
import design_patterns.creational_patterns.builder_design_pattern.cars.Manual;
import design_patterns.creational_patterns.builder_design_pattern.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println(car.getCarType());

        ManualCarBuilder manualBuilder = new ManualCarBuilder();
        director.constructSUV(manualBuilder);
        Manual manualCar = manualBuilder.getResult();
        System.out.print(manualCar.getCarType()+" ");
        manualCar.print();
    }
}
