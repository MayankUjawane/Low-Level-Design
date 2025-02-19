package design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.ChairFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.SofaFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    private Chair chair;
    private Sofa sofa;

    public ModernFurnitureFactory() {
        chair = new ChairFactory("Modern").getChair();
        sofa = new SofaFactory("Modern").getSofa();
    }

    public void getFurniture() {
        chair.chair();
        sofa.sofa();
    }
}
