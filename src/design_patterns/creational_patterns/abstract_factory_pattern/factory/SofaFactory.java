package design_patterns.creational_patterns.abstract_factory_pattern.factory;

import design_patterns.creational_patterns.abstract_factory_pattern.sofa.ModernSofa;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.Sofa;
import design_patterns.creational_patterns.abstract_factory_pattern.sofa.VictorianSofa;

public class SofaFactory {
    Sofa sofa;

    public SofaFactory(String type) {
        switch (type) {
            case "Modern":
                sofa = new ModernSofa();
                break;
            case "Victorian":
                sofa = new VictorianSofa();
        }
    }

    public Sofa getSofa() {
        return sofa;
    }
}
