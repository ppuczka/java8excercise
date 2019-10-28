package pl.coderslab.excercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Lambdas {

    Predicate predicate = value -> {
        if (value instanceof String) {
            System.out.println(value);
            return true;
        }
        return false;

    };

    static <T> void printChar(List<T> src, Predicate<T> t) {
        for (T s: src) {
            if (s.equals(t)) {
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {

        String imputString = "qasdasdafdsgfhvsacstrtfecsdcsadcscashrtsdfa";
        List<String> characterList = Arrays.asList(imputString.split(""));
        Collections.sort(characterList, String::compareTo);
        characterList.forEach(System.out::println);

        Predicate predicate = value -> {
            if (value instanceof String) {
                System.out.println(value);
                return true;
            }
            return false;

        };

        Predicate numPredictate = value -> {
            if (value instanceof Number) {
                System.out.println(value);
                return true;
            }
            return false;
        };

        Predicate stringPredictate = str -> {
            if (str.equals("t")) {
                return true;
            }
            return false;
        };

        predicate.test(1234456);
        numPredictate.test("czesc");
        numPredictate.test(123);
        numPredictate.test(134.1312);
        numPredictate.test(0.0111);
        numPredictate.test("011");
        numPredictate.test(111);


        FunctionMath power = new FunctionMath<Double>() {
            @Override
            public Double caluclate(Double aDouble) {
                return Math.pow(aDouble, 2.0);
            }
        };

        System.out.println(power.caluclate(2.0));

        FunctionMath<Integer> lambdaSubstract = s -> s - 1;
        System.out.println(lambdaSubstract.caluclate(21));


        characterList.forEach(s -> {
            if (s.equals("t")) {
                System.out.println(s);
            }
        } );
        }

    }


