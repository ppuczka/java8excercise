package pl.coderslab.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> transformedSrc = new ArrayList<>();
        for (S s: src) {
            if(f.check(s)) {
                t.transform(s);
                transformedSrc.add(t.transform(s));
            }

        }
        return transformedSrc;
    }

    public static void main(String[] args) {

        NumberTransform transform = new NumberTransform();
        NumberFilter filter = new NumberFilter();
        List<Integer> list = Arrays.asList(1, 10, 14, 27, 11, 53);

        List<Integer> transformedList = create(list, filter, transform);
        transformedList.forEach(System.out::println);

        List<Integer> lambdaTransformedList = create(list, i -> i < 20, transform);
        lambdaTransformedList.forEach(System.out::println);

    }

}
