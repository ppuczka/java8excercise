package pl.coderslab.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList();
        personList.add(new Person("Adam","Abacki"));
        personList.add(new Person("Andrzej","Bebacki"));
        personList.add(new Person("Rafal","Zebacki"));
        personList.add(new Person("Lukasz","Lebacki"));

        Collections.sort(personList);
        for (Person p : personList) {
            System.out.println(p);

        }
    }

}
