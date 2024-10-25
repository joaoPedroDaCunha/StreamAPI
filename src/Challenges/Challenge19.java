package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge19 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));
        int sum = numbers.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
