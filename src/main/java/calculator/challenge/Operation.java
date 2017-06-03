package calculator.challenge;

/**
 * Created by timonewton on 6/2/17.
 */
public interface Operation {

    //performs the operation on the passed parameter
    public Integer doOperation(Integer initialVal);

    //does the reverse of the defined operation on the passed parameter
    public Integer reverseOperation(Integer initialVal);
}
