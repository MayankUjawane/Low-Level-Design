package design_patterns.creational_patterns.abstract_factory_pattern.abstract_factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.ChairFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.factory.SofaFactory;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    private Chair chair;
    private Sofa sofa;

    public VictorianFurnitureFactory() {
        chair = new ChairFactory("Victorian").getChair();
        sofa = new SofaFactory("Victorian").getSofa();
    }

    public void getFurniture() {
        chair.chair();
        sofa.sofa();
    }
}
