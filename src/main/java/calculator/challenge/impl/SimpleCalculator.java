package calculator.challenge.impl;

import calculator.challenge.Calculator;

import java.util.Stack;

public class SimpleCalculator implements Calculator {

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    Integer currentValue=0;

    Stack<SimpleOperation> operationHistory = new Stack<SimpleOperation>();
    Stack<SimpleOperation> undoHistory = new Stack<SimpleOperation>();

    //calculate an operation where both operands are provided.
    public Integer doOperation(SimpleOperation.operation operation, Integer op1, Integer op2){
        SimpleOperation currentOperation = new SimpleOperation(op1, op2, operation);
        currentValue = currentOperation.doOperation();
        operationHistory.push(currentOperation);
        undoHistory.clear();
        return currentValue;
    }

    //calculate and operation where only the second operand is provided
    public Integer doOperation(SimpleOperation.operation operation, Integer op2){
        SimpleOperation currentOperation = new SimpleOperation(currentValue, op2, operation);
        currentValue = currentOperation.doOperation();
        operationHistory.push(currentOperation);
        undoHistory.clear();
        return currentValue;
    }

    public Integer undoOperation(){
        if(!operationHistory.isEmpty()) {
            SimpleOperation currentOperation = operationHistory.pop();
            currentValue = currentOperation.reverseOperation();
            undoHistory.push(currentOperation);
        }
        return currentValue;
    }

    public Integer redoOperation(){
        if(!undoHistory.isEmpty()) {
            SimpleOperation currentOperation = undoHistory.pop();
            currentValue = currentOperation.doOperation();
            operationHistory.push(currentOperation);
        }
        return currentValue;
    }

}