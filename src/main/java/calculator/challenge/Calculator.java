package calculator.challenge;

import java.util.Stack;

public class Calculator {

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public enum operations {ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION};

    Integer currentValue=0;

    Stack<Operation> operationHistory = new Stack<Operation>();
    Stack<Operation> undoHistory = new Stack<Operation>();

    //calculate an operation where both operands are provided.
    public Integer doOperation(operations operation, Integer op1, Integer op2){
        Operation currentOperation = new Operation(op1, op2, operation);
        currentValue = currentOperation.doOperation();
        operationHistory.push(currentOperation);
        undoHistory.clear();
        return currentValue;
    }

    //calculate and operation where only the second operand is provided
    public Integer doOperation(operations operation, Integer op2){
        Operation currentOperation = new Operation(currentValue, op2, operation);
        currentValue = currentOperation.doOperation();
        operationHistory.push(currentOperation);
        undoHistory.clear();
        return currentValue;
    }

    public Integer undoOperation(){
        if(!operationHistory.isEmpty()) {
            Operation currentOperation = operationHistory.pop();
            currentValue = currentOperation.reverseOperation();
            undoHistory.push(currentOperation);
        }
        return currentValue;
    }

    public Integer redoOperation(){
        if(!undoHistory.isEmpty()) {
            Operation currentOperation = undoHistory.pop();
            currentValue = currentOperation.doOperation();
            operationHistory.push(currentOperation);
        }
        return currentValue;
    }

    public static void  main(String[] args){
        Calculator calculator = new Calculator();
        int op1 = 1;
        int op2 = 2;
        operations operation = operations.ADDITION;
        System.out.println(op1 + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,1,2));
        op1 = 2;
        op2 = 4;
        operation = operations.MULTIPLICATION;
        System.out.println(op1 + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,1,2));
        op2 = 2;
        operation = operations.DIVISION;
        System.out.println(calculator.getCurrentValue() + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,2));
    }

}