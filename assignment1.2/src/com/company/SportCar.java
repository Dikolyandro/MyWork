package com.company;

public class SportCar extends Car {
    public double speed;
    public SportCar(double speed, String brand, String carClass, int weight){
        super(brand, carClass, weight);
        this.speed = speed;
    }

}
