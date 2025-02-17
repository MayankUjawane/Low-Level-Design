package design_patterns.structural_patterns.composite_design_pattern.resolve_arithmetic_expression;

public class Number implements ArithmeticExpression {
    int number;

    Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }
}
