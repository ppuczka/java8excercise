package pl.coderslab.homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main1 {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("z", "cz");
        people[1] = new Person("b", "eb");
        people[2] = new Person("f", "ga");
        people[3] = new Person("x", "xy");
        people[4] = new Person("y", "ya");

        Arrays.sort(people);
        for (Person person : people) {

            System.out.println(person);
        }

    }

}