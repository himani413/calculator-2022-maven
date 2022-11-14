package v6.Operations;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class OperationFactoryTest {

    @Test
    public void shoulReurnAddOperationObjectForPlusMark(){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance("+");

        //check whether the operation object is an instance of AddOperation class.
        assertThat(operation, instanceOf(AddOperation.class));
    }

    @Test
    public void shoulReurnAvgOperationObjectForAvgMark(){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance("avg");

        //check whether the operation object is an instance of AvgOperation class.
        assertThat(operation, instanceOf(AvgOperation.class));
    }

    @Test
    public void shoulReurnMaxOperationObjectForMaxMark(){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance("max");

        //check whether the operation object is an instance of MaxOperation class.
        assertThat(operation, instanceOf(MaxOperation.class));
    }

    @Test
    public void shoulReurnNullWhenoperationNotFound(){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance("abc");

        //check whether the operation object is a  null value.
        assertThat(operation, is(nullValue()));
    }

}