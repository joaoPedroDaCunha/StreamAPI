package Challenges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge14 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));
        
        int number = numbers.stream().filter(n -> n == 2 || n ==3 || n == 5 || n%2 != 0 && n%3 !=0 && n%5 !=0).reduce(0,Integer::max);

        System.out.println(number);
    }
}