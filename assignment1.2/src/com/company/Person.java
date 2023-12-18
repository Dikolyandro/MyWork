package com.company;

public class Person extends Driver{
    public int age;
    public Person(int age, String fullname, int drivingExperience, String brand, String carClass, int weight){
        super(fullname, drivingExperience, brand, carClass, weight);
        this.age = age;
    }
}
