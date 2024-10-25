package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Challenge5 {

    public static void main(String[] args) {
        
        List<Integer> numbers = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3));

        int media = (int) (numbers.stream().filter(n -> n> 5).reduce(0,Integer::sum)/numbers.stream().filter(n -> n >5).count());

        System.out.println(media);

    }
    
}