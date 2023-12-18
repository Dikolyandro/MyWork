package com.company;

public class Driver extends Car {
    public String fullname;
    public int drivingExperience;
    public Driver(String fullname, int drivingExperience, String brand, String carClass, int weight){
        super(brand, carClass, weight);
        this.fullname = fullname;
        this.drivingExperience = drivingExperience;
    }
    public void toString(String fullname, int drivingExperience) {
        System.out.println(fullname + " " + drivingExperience);
    }
}
