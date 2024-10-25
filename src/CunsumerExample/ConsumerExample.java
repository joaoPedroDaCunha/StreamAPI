package CunsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> printNumbersByPair = number ->{
            if(number % 2 == 0){
                System.out.println(number);
            }
        };

        numbers.stream().forEach(printNumbersByPair);

        numbers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                if(number %2 == 0){
                    System.out.println(number);
                }
            }
        });

        numbers.stream().forEach( number -> {
                if(number %2 == 0){
                    System.out.println(number);
                }
        });

        numbers.forEach( number -> {
            if(number %2 == 0){
                System.out.println(number);
            }
        });
    }
    
}