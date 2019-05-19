package pl.coderslab.parttwo;

import java.util.ArrayList;
import java.util.List;

import static pl.coderslab.parttwo.Main1.createList;

public class Main3 {

    static <T, S> List<T> create(List<S> src, Filter<S> filter, Transform<T, S> transform) {

        List<T> outList = new ArrayList<>();

        for (S s : src) {
            if (filter.check(s)) {
                T trans = transform.change(s);
                outList.add(trans);

            }
        }
        System.out.println(outList);
        return outList;
    }


    public static void main(String[] args) {

        List<Integer> src = createList(50, 10);
        Filter<Integer> filter = integer -> integer < 17;
        Transform<Integer, Integer> transform = integer ->  integer + 10;

        create(src, filter, transform);
    }

}

