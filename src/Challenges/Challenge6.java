package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Challenge6 {

    public static void main(String[] args) {
        
        List<Integer> numbers = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3));

        boolean check = numbers.stream().noneMatch(n -> n > 10);

        System.out.println("ha algum nomero maior que 10 :"+check);

    }
}