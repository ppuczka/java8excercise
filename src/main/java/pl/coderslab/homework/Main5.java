package pl.coderslab.homework;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        List<Car> vehicleList = new ArrayList<>();

        vehicleList.add(new Car(190, "Tesla Model S", "Sport"));
        vehicleList.add(new Car(190, "Tesla Model S", "Sport"));
        vehicleList.add(new Car(190, "Tesla Model S", "Sport"));
        vehicleList.add(new Car(190, "Tesla Model S", "Sport"));
        vehicleList.add(new Car(190, "Tesla Model S", "Sport"));

        vehicleList.forEach(car -> System.out.println(car));

        }
    }


