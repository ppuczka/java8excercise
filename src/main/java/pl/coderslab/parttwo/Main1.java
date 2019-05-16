package pl.coderslab.parttwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main1 {

    static <T> void pritnList(List<T> list, Filter<T> filter) {

        for (T s : list) {
            if (filter.check(s)) {
                System.out.println(s);
            }
        }

    }

    public static List<Integer> createList(Integer bound, Integer size) {
        Random r = new Random();
        List<Integer> integers = new ArrayList();

        for (int i = 0; i < size ; i++) {
            Integer random = r.nextInt(bound);
            integers.add(random);

        }
        System.out.print(integers +"\n");
     return integers;
    }

    public static void main(String[] args) {
        Random r = new Random(10);

        Filter<Integer> filter  = integer -> integer < 7;
        NumberFilter numberFilter = new NumberFilter();

        List<Integer> integers = new ArrayList();

        for (int i = 0; i < 10 ; i++) {
            Integer random = r.nextInt(70);
            System.out.println(random);
            integers.add(random);

        }

        System.out.println(integers.size());
        System.out.println(integers.toString());

        pritnList(integers, filter);
        pritnList(integers,numberFilter);
        pritnList(integers, integer -> integer < 100);
    }


}