//package pl.coderslab;
//
//import java.util.*;
//import java.util.function.Predicate;
//
//public class Main4 <T> {
//
//
//    public static String printList() {
//
//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        System.out.println("Wpisz znaki");
//        String chain = scanner.next();
//        String[] split = chain.split("");
//        list = Arrays.asList(split);
//        Collections.sort(list);
//        return list.toString();
//    }
//
//
//    public void main(String[] args) {
//
//
//        Predicate<String> predicate = new Predicate<String>() {
//
//            @Override
//            public boolean test(String string) { ;
//                return test(string);
//            }
//        };
//
//        Predicate<String> predicateLambda = string -> string.length() > 1;
//        System.out.println(predicateLambda.test("proba"));
//        Predicate<T> intLambra = i -> Number.class.isInstance(i);
//        System.out.println(intLambra.test("1221"));
//    }
//
//
//}