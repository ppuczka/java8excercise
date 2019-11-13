package pl.coderslab.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Przemek", "Puczka", "male", 33, 2500.00f));
        employees.add(new Employee("Angelika", "Grabowska", "female", 23, 2100.00f));
        employees.add(new Employee("Karolina", "Szary", "female", 30, 1500.00f));
        employees.add(new Employee("Lukasz", "Bęben", "male", 40, 3500.00f));

//        employees.stream().filter(p -> p.getSurname().startsWith("G")).forEach(System.out::println);
//        employees.stream().filter(p -> p.getBirthDate() < 40 && p.getBirthDate() > 35).forEach(System.out::println);
        employees.stream().forEach(p -> {
            if (p.getGender().equals("female") && p.getBirthDate() <= 30 && p.getSalary() < 2500f) {
                p.salary *= 1.05f;
            }
        } );
        employees.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> newNumbers = numbers.stream().filter(n -> (n * n -5) < 20).collect(Collectors.toList());
        newNumbers.forEach(System.out::println);

        List<String> list = Arrays.asList("ala", "ma", "kota", "a", "kot", "ma", "ale", "maca");
        list.stream().forEach(n -> System.out.println(n.length()));
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        sortedList.stream().filter(n -> n.contains("c")).forEach(System.out::println);
    }




}
