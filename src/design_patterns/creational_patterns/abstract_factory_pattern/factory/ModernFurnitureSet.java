package design_patterns.creational_patterns.abstract_factory_pattern.factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.chair.ModernChair;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.ModernSofa;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;

public class ModernFurnitureSet implements FurnitureSet {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
