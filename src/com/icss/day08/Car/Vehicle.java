package com.icss.day08.Car;

public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle(){

    }

    public Vehicle(int wheels, double weight) {
        super();
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "轮胎的个数是：" + wheels +
                "\t车重：" + weight+"\n";
    }
}
