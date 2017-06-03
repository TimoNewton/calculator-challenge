package calculator.challenge;

import calculator.challenge.impl.SimpleCalculator;
import calculator.challenge.impl.SimpleOperation;

/**
 * Created by timonewton on 6/2/17.
 */
public class Application {


    public static void  main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        int op1 = 1;
        int op2 = 2;
        SimpleOperation.operation operation = SimpleOperation.operation.ADDITION;
        System.out.println(op1 + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,1,2));
        op1 = 2;
        op2 = 4;
        operation = SimpleOperation.operation.MULTIPLICATION;
        System.out.println(op1 + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,1,2));
        op2 = 2;
        operation = SimpleOperation.operation.DIVISION;
        System.out.println(calculator.getCurrentValue() + " "+operation.name()+" " + op2 + " = "+calculator.doOperation(operation,2));
    }
}
