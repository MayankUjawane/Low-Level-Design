package design_patterns.structural_patterns.decorator_pattern.Decorator;

import design_patterns.structural_patterns.decorator_pattern.BasePizza.BasePizza;

public class Paneer implements ToppingDecorator {
    BasePizza basePizza;

    public Paneer(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
