package calculator.challenge;

import calculator.challenge.operator.ReversableOperator;

import java.util.Stack;

public class Calculator {

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    Integer currentValue=0;

    Stack<Operation> operationHistory = new Stack<Operation>();
    Stack<Operation> undoHistory = new Stack<Operation>();

    //calculate and operation where only the second operand is provided
    public Integer doOperation(ReversableOperator operation, Integer op2){
        Operation currentOperation = new Operation(op2, operation);
        currentValue = currentOperation.doOperation(currentValue);
        operationHistory.push(currentOperation);
        undoHistory.clear();
        return currentValue;
    }

    public Integer undoOperation(){
        if(!operationHistory.isEmpty()) {
            Operation currentOperation = operationHistory.pop();
            currentValue = currentOperation.reverseOperation(currentValue);
            undoHistory.push(currentOperation);
        }
        return currentValue;
    }

    public Integer redoOperation(){
        if(!undoHistory.isEmpty()) {
            Operation currentOperation = undoHistory.pop();
            currentValue = currentOperation.doOperation(currentValue);
            operationHistory.push(currentOperation);
        }
        return currentValue;
    }

}