package pl.coderslab.homework;

import java.util.function.Function;

public class Main4 {

    public static String transform(String str, Function<String, String> function) {
            return function.apply(str);

    }


    public static void main(String[] args) {

        String sampleText = "CODERSLAB";
        Function<String, String> function = (s -> s.toLowerCase().substring(2,s.length()-2));

        String finalText = transform(sampleText, function);
        System.out.println(finalText);
    }
}
