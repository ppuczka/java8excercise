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

    public static void main(String[] args) {
        Random r = new Random(10);

        Filter<Integer> filter  = new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 7;
            }
        };

        List<Integer> integers = new ArrayList();

        for (int i = 0; i < 10 ; i++) {
            Integer random = r.nextInt(70);
            System.out.println(random);
            integers.add(random);

        }

        System.out.println(integers.size());
        System.out.println(integers.toString());

        pritnList(integers, filter);
    }


}