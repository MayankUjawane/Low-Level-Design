package design_patterns.creational_patterns.abstract_factory_pattern;

import design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory.FurnitureFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory.ModernFurnitureFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory.VictorianFurnitureFactory;

public class Client {
    public static void main(String[] args) {
        provideFurniture("Modern");
        provideFurniture("Victorian");
        provideFurniture("Anything");
    }
    private static void provideFurniture(String typeOfFurniture) {
        FurnitureFactory furnitureFactory;

        if(typeOfFurniture.equals("Modern")) {
            furnitureFactory = new ModernFurnitureFactory();
        } else if(typeOfFurniture.equals("Victorian")) {
            furnitureFactory = new VictorianFurnitureFactory();
        } else {
            System.out.println("Sorry this type of furniture set is not available in our store!");
            return;
        }

        furnitureFactory.getFurniture();
    }
}
