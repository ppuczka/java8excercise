package pl.coderslab;


import java.util.ArrayList;
import java.util.List;


public class Main1 {

    static <T> void printList(List<T> src, Filter<T> filter) {

        for (T s : src) {
            if (filter.check(s)) {
                System.out.println(s);

            }
        }
    }

    public static void main(String[] args) {

        List<Integer> src = new ArrayList();
        src.add(10);
        src.add(18);
        src.add(30);

        NumberFilter numberFilter = new NumberFilter();
        System.out.println(numberFilter.check(19));

        printList(src, numberFilter);
        System.out.println("Lambda");
       printList(src, v -> v < 20);
    }




}

