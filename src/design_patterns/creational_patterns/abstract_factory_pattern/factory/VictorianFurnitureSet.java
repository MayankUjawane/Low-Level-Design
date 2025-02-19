package design_patterns.creational_patterns.abstract_factory_pattern.factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.chair.VictorianChair;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.VictorianSofa;

public class VictorianFurnitureSet implements FurnitureSet {
    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }
}
