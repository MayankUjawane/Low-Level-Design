package design_patterns.creational_patterns.abstract_factory_pattern.factory;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;
import design_patterns.creational_patterns.abstract_factory_pattern.chair.ModernChair;
import design_patterns.creational_patterns.abstract_factory_pattern.chair.VictorianChair;

public class ChairFactory {
    Chair chair;

    public ChairFactory(String type) {
        switch (type) {
            case "Modern":
                chair = new ModernChair();
                break;
            case "Victorian":
                chair = new VictorianChair();
        }
    }

    public Chair getChair() {
        return chair;
    }
}
