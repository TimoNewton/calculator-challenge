package calculator.challenge;

import java.util.function.IntBinaryOperator;

/**
 * Created by timonewton on 6/2/17.
 */
public interface ReversableOperator extends IntBinaryOperator {

    //does the reverse operation of the basic application
    public int reverseAsInt(int left, int right);
}
