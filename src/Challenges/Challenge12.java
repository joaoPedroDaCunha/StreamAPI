package Challenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Challenge12 {
    public static void main(String[] args) {
        List<Integer> numbers = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));

        int product = numbers.stream().reduce(1,(n,b) -> n*b);

        System.out.println(product);
    }
}
