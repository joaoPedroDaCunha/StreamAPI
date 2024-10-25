package Challenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Challenge11 {
    public static void main(String[] args) {
        List<Integer> numbers = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));

         numbers.stream().map(n -> Math.pow(n, 2) ).forEach(System.out::println);
    }
}
