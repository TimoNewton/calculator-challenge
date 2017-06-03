package calculator.challenge;

import calculator.challenge.impl.SimpleOperation;
import org.junit.Assert;
import org.junit.Test;
import calculator.challenge.impl.SimpleOperation.operation;


/**
 * Created by timonewton on 6/2/17.
 */
public class SimpleOperationTest {
    @Test
    public void doOperation() throws Exception {
        SimpleOperation currOperation = new SimpleOperation(1,2, operation.ADDITION);
        Integer result = currOperation.doOperation();
        Assert.assertTrue("Addition failed", result.intValue()==3);
        currOperation = new SimpleOperation(2,1, operation.SUBTRACTION);
        result = currOperation.doOperation();
        Assert.assertTrue("Subtraction failed", result.intValue()==1);
        currOperation = new SimpleOperation(2,2, operation.MULTIPLICATION);
        result = currOperation.doOperation();
        Assert.assertTrue("Multiplication failed",result.intValue()==4);
        currOperation = new SimpleOperation(4,2, operation.DIVISION);
        result = currOperation.doOperation();
        Assert.assertTrue("Division failed, result = "+result,result.intValue()==2);
    }

    @Test
    public void reverseOperation() throws Exception {
        SimpleOperation currOperation = new SimpleOperation(1,2, operation.ADDITION);
        Integer result = currOperation.reverseOperation();
        Assert.assertTrue("Addition failed", result.intValue()==1);
        currOperation = new SimpleOperation(2,1, operation.SUBTRACTION);
        result = currOperation.reverseOperation();
        Assert.assertTrue("Subtraction failed", result.intValue()==2);
        currOperation = new SimpleOperation(2,2, operation.MULTIPLICATION);
        result = currOperation.reverseOperation();
        Assert.assertTrue("Multiplication failed",result.intValue()==2);
        currOperation = new SimpleOperation(4,2, operation.DIVISION);
        result = currOperation.reverseOperation();
        Assert.assertTrue("Division failed, result = "+result,result.intValue()==4);
    }

}