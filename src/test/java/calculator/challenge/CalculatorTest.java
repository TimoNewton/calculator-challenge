package calculator.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by timonewton on 6/2/17.
 */
public class CalculatorTest {

    @Test
    public void doOperation() throws Exception {
        Calculator calc = new Calculator();
        assertTrue("Calculator did not initialise with value 0", 0 == calc.getCurrentValue());
        assertEquals("Incorrect addition", 3, calc.doOperation(Calculator.operations.ADDITION,1,2).intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 3 == calc.getCurrentValue());
    }

    @Test
    public void doOperation1() throws Exception {
        Calculator calc = new Calculator();
        assertTrue("Calculator did not initialise with value 0", 0 == calc.getCurrentValue());
        assertEquals("Incorrect addition",2, calc.doOperation(Calculator.operations.ADDITION,2).intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 2 == calc.getCurrentValue());
        assertEquals("Incorrect addition", 12,calc.doOperation(Calculator.operations.MULTIPLICATION,6).intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 12 == calc.getCurrentValue());
    }

    @Test
    public void undoAndRedoOperation() throws Exception {
        Calculator calc = new Calculator();
        assertTrue("Calculator did not initialise with value 0", 0 == calc.getCurrentValue());
        assertEquals("Incorrect addition",2, calc.doOperation(Calculator.operations.ADDITION,2).intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 2 == calc.getCurrentValue());
        assertEquals("Incorrect multiplication", 12, calc.doOperation(Calculator.operations.MULTIPLICATION,6).intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 12 == calc.getCurrentValue());
        //After setup, now undoing operation
        assertEquals("undo of  2 * 6 was incorrect", 2, calc.undoOperation().intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 2 == calc.getCurrentValue());
        assertEquals("undo of  0 + 2  was incorrect",0, calc.undoOperation().intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 0 == calc.getCurrentValue());
        assertEquals("undo of  empty history  was incorrect", 0, calc.undoOperation().intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 0 == calc.getCurrentValue());
        //After undoing all operations, redoing operations
        assertEquals("Incorrect redo of addition", 2, calc.redoOperation().intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 2 == calc.getCurrentValue());
        assertEquals("Incorrect redo of multiplication", 12, calc.redoOperation().intValue());
        assertTrue("current value incorrectly updated to "+calc.getCurrentValue(), 12 == calc.getCurrentValue());
        assertEquals("redo of  empty history  was incorrect", calc.redoOperation().intValue(),12);
        //undo twice, then do a new operation, then test that there is nothing to redo
        calc.undoOperation();
        calc.undoOperation();
        calc.doOperation(Calculator.operations.ADDITION,36);
        assertEquals("second addition incorrect", calc.getCurrentValue().intValue(),36);
        assertEquals("redo of  empty history  was incorrect", calc.redoOperation().intValue(),36);


    }

}