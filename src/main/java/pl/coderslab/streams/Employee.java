package pl.coderslab.streams;

import java.sql.Date;

public class Employee implements Cloneable {

    private String name;
    private String Surname;
    private String gender;
    private Integer birthDate;
    public Float salary;


    public Employee(String name, String surname, String gender, Integer birthDate, Float salary) {
        this.name = name;
        Surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Employee clone(){
        try {
            Employee employee =  (Employee) super.clone();
            return employee;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

