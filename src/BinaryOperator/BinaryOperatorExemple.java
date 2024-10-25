package BinaryOperator;

import java.util.Arrays;
import java.util.List;
//import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //BinaryOperator<Integer> sum = (numberOne, numberTwo) -> numberOne + numberTwo;

        //int result = numbers.stream().reduce(0, sum );

        //int result = numbers.stream().reduce(0, new BinaryOperator<Integer>(){
//
//           @Override
//            public Integer apply(Integer t, Integer u) {
//                return t+u;
//            }
//
//        });

    //    int result = numbers.stream().reduce(0, (numberOne,numberTwo) -> numberOne+numberTwo);

    int result = numbers.stream().reduce(0, Integer::sum);

        System.out.println(result);
    }    
}
