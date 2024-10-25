package PredicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","kotlin","python","javascript","c","go","ruby");

        Predicate<String> moreThanFiveCharactrs = word -> word.length() > 5;
        
        words.stream().filter(moreThanFiveCharactrs).filter(word -> word == "kotlin").forEach(System.out::println);;
    }
}
