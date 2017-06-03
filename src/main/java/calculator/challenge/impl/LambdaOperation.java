package calculator.challenge.impl;

import calculator.challenge.Operation;

/**
 * Created by timonewton on 6/2/17.
 */
public class LambdaOperation implements Operation {


    Integer intVal;
    LambdaOperator currOperation;

    @Override
    public Integer doOperation(Integer initialVal) {
        return currOperation.applyAsInt(initialVal, intVal);
    }

    @Override
    public Integer reverseOperation(Integer initialVal) {
        return currOperation.reverseAsInt(initialVal, intVal);
    }

    public LambdaOperation(Integer intVal, LambdaOperator currOperation) {
        this.intVal = intVal;
        this.currOperation = currOperation;
    }
}
