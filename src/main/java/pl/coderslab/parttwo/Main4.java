package pl.coderslab.parttwo;

import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                System.out.println(o);
                return false;
            }
        };

        StringFilter filter = new StringFilter();

        String one = "1";
        Integer oneInt = 1;
        Character oneChar = 1;

      if (filter.check(oneChar)) {
          System.out.println("String");
      }else System.out.println("Not String");

    CheckIfString<Object> checkIfString = o -> o instanceof String;
       if(checkIfString.check(oneInt)) {
            System.out.println(oneInt);
        } else {
            System.out.println("Not string");
        }

    }

}
