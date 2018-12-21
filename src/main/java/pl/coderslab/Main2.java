package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    static  <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S>  transform) {

        for (S s : src) {
            if (f.check(s)) {
                System.out.println(transform.change(s));

            }
        }



    }

    public static void main(String[] args) {

        List<Integer> src = new ArrayList<>();
        src.add(10);
        src.add(18);
        src.add(30);
        Filter<Integer> filter = integer -> integer < 20;
        Transform<Integer, Integer> integerTransform = integer -> integer - 1;

        //zwraca null wg metody w Klasie NumberTransform nie wiem jak nadpisac tę metodę
        NumberTransform numberTransform = new NumberTransform();

        printList(src, filter, numberTransform);

    }

}
