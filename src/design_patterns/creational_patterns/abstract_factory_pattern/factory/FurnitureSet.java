package design_patterns.creational_patterns.abstract_factory_pattern.factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;

public interface FurnitureSet {
    Chair getChair();
    Sofa getSofa();
}
