package v6.Operations;

public class OperationFactory {

    public Operation getInstance(String operator){
        Operation operation = null;
        if(operator.equals("+")){

            operation = new AddOperation();

        }else if (operator.equals("avg")){

            operation = new AvgOperation();

        }else if(operator.equals("max")){
            operation = new MaxOperation();
        }

        return operation;

    }
}
