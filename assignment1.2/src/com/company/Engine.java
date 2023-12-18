package com.company;

public class Engine extends Car {
    public String power;
    public String manufacture;
    public Engine(String power, String manufacture, String brand, String carClass, int weight) {
        super(brand, carClass, weight);
        this.manufacture = manufacture;
        this.power = power;
    }
    public void toString(String power, String manufacture) {
        System.out.println(power + " " + manufacture);
    }
}
