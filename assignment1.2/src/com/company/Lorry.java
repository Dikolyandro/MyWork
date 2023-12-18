package com.company;

public class Lorry extends Car {
    public int carring;
    public Lorry(int carring, String brand, String carClass, int weight){
        super(brand, carClass, weight);
        this.carring = carring;
    }
}
