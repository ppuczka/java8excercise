package pl.coderslab.excercises;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }

    public static void main(String[] args) {

        NumberTransform transform = new NumberTransform();
        NumberFilter filter = new NumberFilter();
        List<Integer> list = Arrays.asList(1, 10, 14, 27, 11, 53);

//        printList(list, filter, transform);
//
//        for (Integer l : list) {
//            if (filter.check(l)) {
//                System.out.println(transform.transform(l));
//
//            }
//        }

        printList(list, f -> f <20, transform);
    }

}
