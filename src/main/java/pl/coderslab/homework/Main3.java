package pl.coderslab.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main3 {


    static public List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String l : list) {
            if (predicate.test(l)) {
                filteredList.add(l);
            }
        }
        return filteredList;
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("tre", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

        Predicate<String> predicate = (string -> (string.length() >= 4));
        List<String>  newList = filterList(list, predicate);
        newList.forEach(System.out::println);

        System.out.println("*************************");

        Predicate<String> predicateB = (string -> (string.contains("b")));
        List<String>  newList2 = filterList(list, predicateB);
        newList2.forEach(System.out::println);

        System.out.println("*************************");

        Predicate<String> predicateEndA = (string ->(string.endsWith("a")));
        List<String>  newList3 = filterList(list, predicateEndA);
        newList3.forEach(System.out::println);

    }
}
