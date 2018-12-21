package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Main3 {


    static <T, S> List<T> createList(List<S> src, Filter<S> filter, Transform<T, S> transform) {

        List<T> finalSrc = new ArrayList<T>();
        for (S s : src) {
            if (filter.check(s)) {
                T trans = transform.change((s));
                finalSrc.add(trans);
                System.out.println(trans);


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

        NumberFilter filter = new NumberFilter();
        NumberTransform transform = new NumberTransform();

        createList(src, s -> s < 20, t -> t + 20);
    }

}


