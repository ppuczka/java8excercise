package pl.coderslab;


import java.util.ArrayList;
import java.util.List;

public class Main2 {

    static <T, S> void printList(List<S> src, Filter<S> filter, Transform<T, S> transform) {
        for (S s: src) {
            if (filter.check(s)) {
                System.out.println(transform.change(s));
            }

        }


    }

    public static void main(String[] args) {

        List<Integer> src2 = new ArrayList();
        src2.add(10);
        src2.add(18);
        src2.add(30);
        NumberFilter filter = new NumberFilter();
        NumberTransform transform = new NumberTransform();
        printList(src2, filter, transform );

        printList(src2, v -> v < 40, s -> s + 2);

        printList(src2, filter, new Transform<String, Integer>() {

            @Override
            public String change(Integer integer) {
                return String.valueOf(integer-1);
        }
    });

    }
}

