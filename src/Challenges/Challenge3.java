package Challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,-3);

        boolean check = numbers.stream().allMatch(n -> n > 0);

        System.out.println("todos os numeros são positivos : "+ check);
    }

}
