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
        Filter<Integer> filter = new Filter<Integer>() {


            public boolean check(Integer integer) {
                return false;
            }
        };
        src.add(10);
        src.add(18);
        src.add(30);

//        printList(src, filter);

        NumberFilter filter1 = new NumberFilter()  {
            public boolean check(Object o) {
                return (Integer)0<10;
            }
        };



        printList(src, filter1);


    }


}

