package calculator.challenge.impl;

import calculator.challenge.Operation;
import calculator.challenge.ReversableOperator;

/**
 * Created by timonewton on 6/1/17.
 */
public class SimpleOperation implements Operation {
    Integer intOperand;
    ReversableOperator currOperator;


    public SimpleOperation(Integer operand1, Integer intOperand, ReversableOperator currOperator) {
        this.intOperand = intOperand;
        this.currOperator = currOperator;
    }

    public Integer doOperation(Integer initialVal){
        return currOperator.applyAsInt(initialVal, intOperand);
    }

    public Integer reverseOperation(Integer initialVal){
        return currOperator.reverseAsInt(initialVal, intOperand);
    }
}
