package calculator.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by timonewton on 6/2/17.
 */
public class OperationTest {
    @Test
    public void doOperation() throws Exception {
        Operation operation = new Operation(1,2, Calculator.operations.ADDITION);
        Integer result = operation.doOperation();
        Assert.assertTrue("Addition failed", result.intValue()==3);
        operation = new Operation(2,1, Calculator.operations.SUBTRACTION);
        result = operation.doOperation();
        Assert.assertTrue("Subtraction failed", result.intValue()==1);
        operation = new Operation(2,2, Calculator.operations.MULTIPLICATION);
        result = operation.doOperation();
        Assert.assertTrue("Multiplication failed",result.intValue()==4);
        operation = new Operation(4,2, Calculator.operations.DIVISION);
        result = operation.doOperation();
        Assert.assertTrue("Division failed, result = "+result,result.intValue()==2);
    }

    @Test
    public void reverseOperation() throws Exception {
        Operation operation = new Operation(1,2, Calculator.operations.ADDITION);
        Integer result = operation.reverseOperation();
        Assert.assertTrue("Addition failed", result.intValue()==1);
        operation = new Operation(2,1, Calculator.operations.SUBTRACTION);
        result = operation.reverseOperation();
        Assert.assertTrue("Subtraction failed", result.intValue()==2);
        operation = new Operation(2,2, Calculator.operations.MULTIPLICATION);
        result = operation.reverseOperation();
        Assert.assertTrue("Multiplication failed",result.intValue()==2);
        operation = new Operation(4,2, Calculator.operations.DIVISION);
        result = operation.reverseOperation();
        Assert.assertTrue("Division failed, result = "+result,result.intValue()==4);
    }

}