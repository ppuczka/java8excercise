package pl.coderslab.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> newNumbers = numbers.stream()
                                .sequential()
                                .map(n -> n * n - 5)
                                .filter(n -> n < 20)
                                .collect(Collectors.toList());

        newNumbers.forEach(System.out::println);

    }
}
