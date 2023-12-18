package com.company;
public class Car {
    public String brand;
    public String carClass;
    public int weight;
    public Car(String brand, String carClass, int weight) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
    }
    public static void start() {
        System.out.println(" Let's go! ");
    }
    public static void stop() {
        System.out.println(" Let's stop! ");
    }
    public static void turnRight() {
        System.out.println(" Turn right! ");
    }
    public static void turnLeft() {
        System.out.println(" Turn left! ");
    }
    public void toString(String brand, String carClass, int weight) {
        System.out.println(brand + " " + carClass + " " + weight);
    }
    public static void main(String[] args) {
        Lorry capacity = new Lorry(400, "RX6", "C", 2000);
        SportCar car1 = new SportCar(600, "Toyota", "Supra", 2500);
        Person damir = new Person(18, "Damir", 1, "Mazda","RX7", 2800);
        Engine dvizhok = new Engine("500Hp", "V8", "BMW", "m3", 3100);
    start();
    stop();
    turnLeft();
    turnRight();
    capacity.toString(capacity.brand, capacity.carClass, capacity.weight);
    car1.toString(car1.brand, car1.carClass, car1.weight);
    dvizhok.toString(dvizhok.power, dvizhok.manufacture);
    damir.toString(damir.fullname, damir.drivingExperience);
    }
}
