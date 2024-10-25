package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge16 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5));

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("lista de numeros pares : \n"+evenNumbers);
        System.out.println("lista de numeros impares: \n"+oddNumbers);

    }
}
