package design_patterns.structural_patterns.composite_design_pattern.resolve_arithmetic_expression;

public class Main {
    public static void main(String[] args) {
        // (1 + 7)
        ArithmeticExpression rightExpression = new Expression(new Number(1), new Number(7), Operation.ADDITION);
        // 2
        ArithmeticExpression leftExpression = new Number(2);
        // 2 * (1 + 7)
        Expression expression = new Expression(leftExpression, rightExpression, Operation.MULTIPLY);

        System.out.println("Final Result is: " + expression.evaluate());
    }
}
