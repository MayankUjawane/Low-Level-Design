package design_patterns.structural_patterns.decorator_pattern.Decorator;

import design_patterns.structural_patterns.decorator_pattern.BasePizza.BasePizza;

// ToppingDecorator is extending BasePizza because we will be adding toppings over the pizza only,
// and after adding toppings it will remain pizza so that if you want to add more toppings you can do that
public interface ToppingDecorator extends BasePizza {
}
