package design_patterns.creational_patterns.abstract_factory_pattern.chair;

import design_patterns.creational_patterns.abstract_factory_pattern.chair.Chair;

public class ModernChair implements Chair {
    @Override
    public void chair() {
        System.out.println("Modern Chair");
    }
}
