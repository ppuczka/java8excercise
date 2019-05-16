package pl.coderslab.parttwo;

import java.util.List;

import static pl.coderslab.parttwo.Main1.createList;

public class Main2  {

    static <T, S> void printList(List<S> list, Filter<S> filter, Transform<T, S> transform) {

        for (S s : list) {
            if (filter.check(s)) {
                System.out.println(transform.change(s));
            }
        }

    }

    public static void main(String[] args) {

        List<Integer> list = createList(77, 10);
        NumberFilter numberFilter = new NumberFilter();
        NumberTransform numberTransform = new NumberTransform();

//        printList(list, numberFilter, numberTransform);

        Filter<Integer> myFilter = integer -> integer < 10;
        Transform<Integer, Integer> myTransform = integer -> integer - 10;
        printList(list, myFilter, myTransform);

    }
}
