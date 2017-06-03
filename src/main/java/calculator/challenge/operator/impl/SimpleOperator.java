package calculator.challenge.operator.impl;

import calculator.challenge.operator.ReversableOperator;

/**
 * Created by timonewton on 6/2/17.
 */
public enum SimpleOperator implements ReversableOperator {
    PLUS    ("+"){
        @Override
        public int applyAsInt(final int left, final int right){
            return left + right;
        }
        @Override
        public int reverseAsInt(final int left, final int right){
            return left - right;
        }
    },
    MINUS   ("-"){
        @Override
        public int applyAsInt(final int left, final int right){
            return left - right;
        }
        @Override
        public int reverseAsInt(final int left, final int right){
            return left + right;
        }
    },
    MULTIPLY("*"){
        @Override
        public int applyAsInt(final int left, final int right){
            return left * right;
        }
        @Override
        public int reverseAsInt(final int left, final int right){
            return left / right;
        }
    },
    DIVIDE  ("/"){
        @Override
        public int applyAsInt(final int left, final int right){
            return left / right;
        }
        @Override
        public int reverseAsInt(final int left, final int right){
            return left * right;
        }
    };

    private final String symbol;

    private SimpleOperator(final String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
