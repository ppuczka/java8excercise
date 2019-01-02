package pl.coderslab.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Przemek", "Puczka", "male", 33, 2500.00f));
        employees.add(new Employee("Angelika", "Grabowska", "female", 23, 2100.00f));
        employees.add(new Employee("Karolina", "Szary", "female", 30, 1500.00f));
        employees.add(new Employee("Lukasz", "Bęben", "male", 40, 3500.00f));

    employees.stream()
            .filter(s -> s.getName().startsWith("A"))
            .forEach(System.out::println);

        System.out.println("**********************");

    employees.stream()
            .filter(s -> s.getBirthDate() > 20 && s.getBirthDate() < 35)
            .forEach(System.out::println);

        System.out.println("**********************");

   List<Employee> employees1 = employees.stream()
            .filter(employee -> employee.getBirthDate() >= 20 && employee.getBirthDate() <= 30)
            .filter(employee -> employee.getSalary() < 3500f)
            .collect(Collectors.toList());

  employees1.forEach(System.out::println);


        System.out.println("**********************");
  employees1.stream()
          .map(employee ->
                  {
                  employee = employee.clone();
                  employee.salary *= 1.25f;
                  return employee;
                  })
                      .forEach(System.out::println);
    }


}
