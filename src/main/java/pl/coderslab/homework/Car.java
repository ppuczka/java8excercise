package pl.coderslab.homework;

public class Car implements Moveable, Inspectionable {

    private String type;

    private Integer maxSpeed;

    private String model;

    public Car(Integer maxSpeed, String model, String type) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void start() {
        System.out.println("Car - samochód jedzie");
    }

    @Override
    public void stop() {

    }

    @Override
    public Object createInspection(Object o) {
        return "Model: inspected";
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                '}';
    }
}


