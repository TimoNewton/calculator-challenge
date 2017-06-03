package calculator.challenge.operator.impl;

import calculator.challenge.operator.ReversableOperator;

import java.util.function.IntBinaryOperator;

/**
 * Created by timonewton on 6/2/17.
 */
public enum LambdaOperator implements ReversableOperator {
    PLUS    ("+", (l, r) -> l + r, (l,r) -> l - r),
    MINUS   ("-", (l, r) -> l - r, (l,r) -> l + r),
    MULTIPLY("*", (l, r) -> l * r, (l,r) -> l / r),
    DIVIDE  ("/", (l, r) -> l / r, (l,r) -> l * r);

    private final String symbol;
    private final IntBinaryOperator binaryOperator;
    private final IntBinaryOperator reverseBinaryOperator;

    private LambdaOperator(final String symbol, final IntBinaryOperator binaryOperator, final IntBinaryOperator reverseBinaryOperator) {
        this.symbol = symbol;
        this.binaryOperator = binaryOperator;
        this.reverseBinaryOperator = reverseBinaryOperator;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public int applyAsInt(int left, int right) {
        return binaryOperator.applyAsInt(left, right);
    }

    public int reverseAsInt(int left, int right){
        return reverseBinaryOperator.applyAsInt(left, right);
    }
}
