package pl.coderslab.homework.b_Dzien_2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

    public static List<String> filterList(List<String> toBeFilteredList, Predicate t) {
        List<String> filteredList = new ArrayList<>();
        for (String str : toBeFilteredList) {
            if (t.test(str))
                filteredList.add(str);
        }
        return filteredList;
    }

    public static String changeStr(String str, Function<String, String> f) {
        return f.apply(str);

    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        Collection<T> returnedCol = new ArrayList<>();
        for (T col : collection) {
            if (predicate.test(col)) {
                returnedCol.add(col);
            }
        }
        return returnedCol.stream().collect(Collectors.toList());
    }

    static <S, T> List<T> changeCollection(Collection<S> collection, Function<S, T> function) {
        List<T> returnedCollection = new ArrayList<>();
        for (S c: collection) {
            function.apply((c));
            returnedCollection.add(function.apply((c)));

        }
        return returnedCollection;
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer, Consumer<T> consumer2) {

            collection.forEach(consumer.andThen(consumer2));
        }

    static String betterString(String s1, String s2, MyPredictate<String, String> predicate) {
        return predicate.test(s1, s2) ?  s1 : s2;
    }


    public static void main(String[] args) {

        String str1 = "Wyraz";
        String str2 = "Wyrażenie";


        Predicate<String> stringPredictate = s -> s.length() < 4;
        Predicate<String> containsB = s -> s.contains("b") || s.contains("B");
        Predicate<String> endsWithA = s -> s.endsWith("a") || s.endsWith("A");
        MyNuberFunctionalInterface<Integer> check = (i -> i < 100 && i > 0);
        Function<String, String> stringFunction = s -> s.substring(2, s.length() - 2).toLowerCase();

        List<Integer> integerList = Arrays.asList(100, 15, 50, 123, 21, 17, 13, 99);
        List<String> stringList = Arrays.asList("Kot", "Pies", "Krowa", "Koń", "Małpa", "Byk", "Kobyła");
        Collection<String> collection = Arrays.asList("Kot", "Pies", "Krowa", "Koń", "Małpa", "Byk", "Kobyła");
        integerList.forEach(integer -> System.out.println(check.checkNumber(integer)));

        List<String> myList = filterList(stringList, endsWithA);
        myList.forEach(System.out::println);

        String myComposedStr = changeStr("Zagadkowa NOC", stringFunction);
        System.out.println(myComposedStr);

        Collection<String> returnedCollection = search(collection, stringPredictate);
        returnedCollection.forEach(System.out::println);

        Function<String, Integer> functionString = s1 -> s1.length();
        List<Integer> functionList = changeCollection(collection, functionString);
        functionList.forEach(System.out::println);

        Consumer<String> firstConsumer = s -> s.substring(1, s.length()-1);
        Consumer<String> secondConsumer = System.out::println;

        consumeCollection(collection, firstConsumer, secondConsumer);


//        web exercises

        Comparator<String> comparator = String::compareTo;
        Comparator<String> characterComparator = (Comparator.comparingInt(c -> c.charAt(0)));
        stringList.sort(String::compareTo);
        stringList.forEach(System.out::println);

        stringList.sort(comparator.reversed());
        stringList.forEach(System.out::println);


        stringList.sort(characterComparator);
        stringList.forEach(System.out::println);

        MyPredictate<String, String> predictate = Predicate.isEqual("Wyraz");
        System.out.println(betterString(str1, str2, predictate));

    }

    }

