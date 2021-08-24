package com.icss.day08.Car;

public class Car extends Vehicle{
    private int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return super.toString()+"这辆车能载" +loader+"人"+"\n";
    }
}
