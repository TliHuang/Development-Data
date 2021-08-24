package com.icss.day08;

public class Bird extends Animal {
    private int age;

    public Bird(String color, String type, int age) {
        super(color, type);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                '}';
    }

    public void fly(){
        System.out.println("这是飞的方法");
    }

}
