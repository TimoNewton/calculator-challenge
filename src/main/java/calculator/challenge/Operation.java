package calculator.challenge;

import calculator.challenge.operator.ReversableOperator;

/**
 * Created by timonewton on 6/1/17.
 */
public class Operation{
    Integer intOperand;
    ReversableOperator currOperator;


    public Operation(Integer intOperand, ReversableOperator currOperator) {
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
