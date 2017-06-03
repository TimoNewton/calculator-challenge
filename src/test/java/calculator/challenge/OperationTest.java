package calculator.challenge;

import org.junit.Assert;
import org.junit.Test;
import calculator.challenge.operator.impl.SimpleOperator;


/**
 * Created by timonewton on 6/2/17.
 */
public class OperationTest {
    @Test
    public void doOperation() throws Exception {
        Operation currOperation = new Operation(2, SimpleOperator.PLUS);
        Integer result = currOperation.doOperation(1);
        Assert.assertTrue("Addition failed", result.intValue()==3);
        currOperation = new Operation(1, SimpleOperator.MINUS);
        result = currOperation.doOperation(2);
        Assert.assertTrue("Subtraction failed", result.intValue()==1);
        currOperation = new Operation(2, SimpleOperator.MULTIPLY);
        result = currOperation.doOperation(2);
        Assert.assertTrue("Multiplication failed",result.intValue()==4);
        currOperation = new Operation(2, SimpleOperator.DIVIDE);
        result = currOperation.doOperation(4);
        Assert.assertTrue("Division failed, result = "+result,result.intValue()==2);
    }

    @Test
    public void reverseOperation() throws Exception {
        Operation currOperation = new Operation(3, SimpleOperator.PLUS);
        Integer result = currOperation.reverseOperation(6);
        Assert.assertTrue("Addition reversal failed", result.intValue()==3);
        currOperation = new Operation(1, SimpleOperator.MINUS);
        result = currOperation.reverseOperation(2);
        Assert.assertTrue("Subtraction reversal failed", result.intValue()==3);
        currOperation = new Operation(2, SimpleOperator.MULTIPLY);
        result = currOperation.reverseOperation(8);
        Assert.assertTrue("Multiplication reversal failed",result.intValue()==4);
        currOperation = new Operation(3, SimpleOperator.DIVIDE);
        result = currOperation.reverseOperation(5);
        Assert.assertTrue("Division reversal failed",result.intValue()==15);
    }

}