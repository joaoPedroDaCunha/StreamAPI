package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));

        boolean check = numbers.stream().noneMatch(n -> n>0);

        System.out.println(check);
    }
}
