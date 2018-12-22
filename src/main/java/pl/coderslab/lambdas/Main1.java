package pl.coderslab.lambdas;

import java.util.*;
import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {

        String myTest = "123213wdsadasdas";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Wpisz ciąg znaków");
//
//        String imput = scan.next();
//        String[] list = imput.split("");
//
//        List<String> colList = Arrays.asList(list);
//        System.out.println(colList.toString());
//
//        colList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
//        System.out.println(colList.toString());


        Predicate predicate = value -> {
            if (value instanceof String) {
                System.out.println(value);
                return true;
            }
            return false;
        };

        predicate.test("23");
        predicate.test(2);


        Predicate predicate1 = value -> {
            if (value instanceof Number) {
                System.out.println(value);
                return true;
            }
            return false;
        };

        predicate1.test(1.32);
        predicate1.test(123);
        predicate1.test("1235");

        myFunctionalInterface<Double> numberPow = (d) -> Math.pow(d, 2);
        myFunctionalInterface<Double> numberRoot = (d) -> Math.sqrt(d);

        System.out.println(numberPow.calculate(2.23));

    }
}


