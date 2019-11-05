package pl.coderslab.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {


        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("computer");
        words.add("mobile");
        words.add("vegetable");
        words.add("starship");

        words.stream().filter(s -> s.startsWith("a") || s.startsWith("s")).sorted().forEach(System.out::println);
        System.out.println("###############################");
        words.stream().filter(s -> s.length() == 5).forEach(System.out::println);
        System.out.println("###############################");

        String created = words.stream().sorted().map(s -> s.substring(0,3)).collect(Collectors.joining(","));
        System.out.println(created);


    }


}
