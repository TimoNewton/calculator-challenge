package calculator.challenge;

import calculator.challenge.operator.impl.LambdaOperator;
import calculator.challenge.operator.impl.SimpleOperator;
import calculator.challenge.operator.ReversableOperator;

/**
 * Created by timonewton on 6/2/17.
 */
public class Application {


    public static void  main(String[] args){
        Calculator calculator = new Calculator();
        int op2 = 8;
        ReversableOperator operator = SimpleOperator.PLUS;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        op2 = 5;
        operator = SimpleOperator.MULTIPLY;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        op2 = 4;
        operator = SimpleOperator.DIVIDE;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        op2 = 12;
        operator = LambdaOperator.PLUS;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        op2 = 9;
        operator = SimpleOperator.MINUS;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Redoing operation, result is "+calculator.redoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        op2 = 8;
        operator = SimpleOperator.MINUS;
        System.out.println(calculator.getCurrentValue() + " "+operator.getSymbol()+" " + op2 + " = "+calculator.doOperation(operator,op2));
        System.out.println("Redoing operation, result is "+calculator.redoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
        System.out.println("Undoing operation, result is "+calculator.undoOperation());
    }
}
