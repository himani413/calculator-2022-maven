package v6.Operations;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddOperationTest {

    @Test
    public void shouldReturnSumWhenPositiveNumbersGiven() {

        //[2,3,4] => 9.0
        AddOperation addOperation = new AddOperation();
        int[] input = {2,3,4};
        double result = addOperation.perform(input);

        //check the result is correct or not
        assertThat(result, is(9.0));
    }

    @Test
    public void shouldReturnSumWhenNegativeNumbersGiven() {

        //[-3-1] => -4.0
        AddOperation addOperation = new AddOperation();
        int[] input = {-3,-1};
        double result = addOperation.perform(input);

        //check the result is correct or not
        assertThat(result, is(-4.0));
    }

    @Test
    public void shouldReturnZeroWhenZerosGiven() {

        //[0,0,0] => 0.0
        AddOperation addOperation = new AddOperation();
        int[] input = {0,0,0};
        double result = addOperation.perform(input);

        //check the result is correct or not
        assertThat(result, is(0.0));
    }

    @Test
    public void shouldReturnSumWhenEmptyArrayGiven() {

        //[] => 0.0
        AddOperation addOperation = new AddOperation();
        int[] input = {};
        double result = addOperation.perform(input);

        //check the result is correct or not
        assertThat(result, is(0.0));
    }
}