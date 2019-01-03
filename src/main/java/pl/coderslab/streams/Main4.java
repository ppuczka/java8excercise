package pl.coderslab.streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("ala", "ma", "kota", "a", "kot", "ma", "ale", "maca");

        list.stream()
                .sorted()
                .forEach(s -> System.out.println(s.length()));

        System.out.println("********************************");

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("********************************");

        list.stream()
                .filter(n -> n.contains("a"))
                .forEach(System.out::println);

        System.out.println("********************************");

        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("********************************");

        Integer sum = list.stream()
                            .collect(Collectors.summingInt(n -> n.length()));

        System.out.println(sum);
    }

}


