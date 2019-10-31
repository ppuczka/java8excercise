package pl.coderslab.homework.b_Dzien_2;

import java.util.function.Predicate;

@FunctionalInterface
public interface StringFunctionalInterface<String> {

    boolean checkString(String str, boolean bool);

    default java.lang.String reverse(java.lang.String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length(); i  >= 0; i--) {
            reversed.append(i);
        }
        return reversed.toString();
    };


}
