package design_patterns.creational_patterns.abstract_factory_pattern.chair;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;

public class VictorianChair implements Chair {
    @Override
    public void chair() {
        System.out.println("Victorian Chair");
    }
}
