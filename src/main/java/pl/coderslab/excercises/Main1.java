package pl.coderslab.excercises;


import java.util.Arrays;
import java.util.List;

public class Main1 {

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        NumberFilter numberFilter = new NumberFilter();
        List<Integer> list = Arrays.asList(1, 2, 23, 14, 57);

        printList(list, numberFilter);

        for (Integer integer : list) {
            if (numberFilter.check(integer)) {
                System.out.println(integer);
            }

        }

        printList(list, f -> f < 20);
        }

        }
    




