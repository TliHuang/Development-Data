package com.icss.day08.Car;

public class TestCar {
    public static void main(String[] args) {
        Car c = new Car(4,600,4);
        Truck t = new Truck(6,1000,3,800);
        System.out.print(c);
        System.out.println(t);
    }
}
