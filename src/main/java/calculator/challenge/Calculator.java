package calculator.challenge;

import calculator.challenge.impl.SimpleOperation;

/**
 * Created by timonewton on 6/2/17.
 */
public interface Calculator {
    //calculate an currOperation where both operands are provided.
    public Integer doOperation(SimpleOperation.operation operation, Integer op1, Integer op2);

    //calculate and currOperation where only the second operand is provided
    public Integer doOperation(SimpleOperation.operation operation, Integer op2);

    //undo the last currOperation done.  If there are no operations to undo, returns 0
    public Integer undoOperation();

    //redo the last currOperation that was undone.  If there are no undone operations, keeps state as is
    public Integer redoOperation();
}
