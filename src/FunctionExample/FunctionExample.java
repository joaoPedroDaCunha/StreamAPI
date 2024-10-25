package FunctionExample;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
       public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //Function<Integer,Integer>  fold = number -> number * 2;

        //List<Integer> foldNumbers = numbers.stream().map(fold).collect(Collectors.toList());
        //List<Integer> foldNumbers = numbers.stream().map(new Function<Integer,Integer>() {
        //
        //    @Override
        //    public Integer apply(Integer t) {
        //        return t * 2;
        //    }
        //    
        //}).collect(Collectors.toList());
        List<Integer> foldNumbers = numbers.stream().map(t -> t * 2).collect(Collectors.toList());

        foldNumbers.stream().forEach(n-> System.out.println(n));
       }
}
