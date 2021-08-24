package com.icss.day08.Car;

public class Truck extends Car{
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString()+"这辆车的载重是" +payload;
    }
}
