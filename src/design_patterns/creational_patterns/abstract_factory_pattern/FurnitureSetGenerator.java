package design_patterns.creational_patterns.abstract_factory_pattern;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.FurnitureSet;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;

public class FurnitureSetGenerator {
    private Chair chair;
    private Sofa sofa;

    FurnitureSetGenerator(FurnitureSet furnitureSet) {
        chair = furnitureSet.getChair();
        sofa = furnitureSet.getSofa();
    }

    public void getFurnitureSet() {
        chair.chair();
        sofa.sofa();
    }
}
