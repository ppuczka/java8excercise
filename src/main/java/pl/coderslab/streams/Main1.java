package pl.coderslab.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("computer");
        words.add("mobile");
        words.add("vegetable");
        words.add("starship");


        words.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


       List<String> newWords = words.stream()
//                  .forEach(s -> System.out.println(s.substring(0,5)));
                    .map(s -> s.substring(0,5))
//                    .filter(s -> s.length() == 8)
//                    .distinct()
                    .collect(Collectors.toList());

        System.out.println("**********************");
        newWords.forEach(System.out::println);

        String newWord = words.stream()
                            .map(s -> s.substring(0,2) + ",")
                            .sorted()
                            .collect(Collectors.joining());

        System.out.println("**********************");
        System.out.println(newWord);
}
    }