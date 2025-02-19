package design_patterns.creational_patterns.abstract_factory_pattern;

import design_patterns.creational_patterns.abstract_factory_pattern.factory.FurnitureSet;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.ModernFurnitureSet;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.VictorianFurnitureSet;

public class Client {
    public static void main(String[] args) {
        provideFurniture("Modern");
        provideFurniture("Victorian");
        provideFurniture("Anything");
    }
    private static void provideFurniture(String typeOfFurniture) {
        FurnitureSetGenerator furnitureSetGenerator;
        FurnitureSet furnitureSet;
        if(typeOfFurniture.equals("Modern")) {
            furnitureSet = new ModernFurnitureSet();
            furnitureSetGenerator = new FurnitureSetGenerator(furnitureSet);
            furnitureSetGenerator.getFurnitureSet();
        } else if(typeOfFurniture.equals("Victorian")) {
            furnitureSet = new VictorianFurnitureSet();
            furnitureSetGenerator = new FurnitureSetGenerator(furnitureSet);
            furnitureSetGenerator.getFurnitureSet();
        } else {
            System.out.println("Sorry this type of furniture set is not available in our store!");
        }
    }
}
