package design_patterns.structural_patterns.decorator_pattern;

import design_patterns.structural_patterns.decorator_pattern.BasePizza.BasePizza;
import design_patterns.structural_patterns.decorator_pattern.BasePizza.Margherita;
import design_patterns.structural_patterns.decorator_pattern.Decorator.ExtraCheese;
import design_patterns.structural_patterns.decorator_pattern.Decorator.Paneer;

public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        System.out.println("Cost of Margherita Pizza: "+margherita.cost());
        BasePizza margheritaWithCheese = new ExtraCheese(margherita);
        System.out.println("Cost of Margherita Pizza With Extra Cheese: "+margheritaWithCheese.cost());
        BasePizza margheritaWithCheeseAndPaneer = new Paneer(margheritaWithCheese);
        System.out.println("Cost of Margherita Pizza With Extra Cheese and Paneer: "+margheritaWithCheeseAndPaneer.cost());
    }
}
