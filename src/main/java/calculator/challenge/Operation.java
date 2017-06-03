package calculator.challenge;

/**
 * Created by timonewton on 6/1/17.
 */
public class Operation {
    Integer operand1;
    Integer operand2;
    Calculator.operations operation;

    public Operation(Integer operand1, Integer operand2, Calculator.operations operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public Integer doOperation(){
        Integer returnInt = null;
        switch(operation){
            case ADDITION:
                returnInt = operand1.intValue() + operand2.intValue();
                break;
            case MULTIPLICATION:
                returnInt = operand1.intValue() * operand2.intValue();
                break;
            case DIVISION:
                returnInt = operand1.intValue() / operand2.intValue();
                break;
            case SUBTRACTION:
                returnInt = operand1.intValue() - operand2.intValue();
                break;
        }
        return returnInt;
    }

    public Integer reverseOperation(){
        return operand1;
    }
}
