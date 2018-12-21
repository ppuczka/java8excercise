package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Main3 {


    static <T, S> List<T> createList(List<T> src, Filter<T> filter, Transform<T, S> transform) {
        List<T> finalSrc = new ArrayList<T>();

        for (T t : src) {
            if (filter.check(t)) {
                T t1 = transform.change((S) t);
                finalSrc.add(t1);

            }
        }

    return finalSrc;

    }

    public static void main(String[] args) {

        List<Integer> src = new ArrayList<Integer>();
        src.add(1);
        src.add(2);
        src.add(10);
        src.add(18);
        src.add(30);
        Filter<Integer> filter = integer -> integer < 20;
        Transform<Integer, Integer> integerTransform = integer -> integer - 1;

        System.out.println(createList(src, filter, integerTransform).toString());
    }
}


