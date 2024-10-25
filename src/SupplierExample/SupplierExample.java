package SupplierExample;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greetings = () -> "Ola, seja bem-vindo(a)!";

        List<String> greetingsList = Stream.generate(greetings).limit(5).collect(Collectors.toList());
        //List<String> greetingsList = Stream.generate(greetings).limit(5).toList();
        //List<String> greetingsList = Stream.generate(() ->"Ola, seja bem-vindo(a)!").limit(5).collect(Collectors.toList());
        //List<String> greetingsList = Stream.generate(() -> {
        //   return  "Ola, seja bem-vindo(a)!";
        // }).limit(5).collect(Collectors.toList());
        

        greetingsList.forEach(s -> System.out.println(s));
        //greetingsList.forEach(System.out::println);
    }
}
