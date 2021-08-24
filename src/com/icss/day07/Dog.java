package com.icss.day07;


public class Dog {
    /*属性*/
    String breed;//品种
    int age;//年龄
    String color;//颜色
    double price;//价格

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*静态方法（属于类，不属于对象）*/
    public static void eat(){
        System.out.println("这是一个吃方法");
    }
    /*实例方法（在类中一般都会写实例方法，属于对象）*/
    public void run(){
        System.out.println("这是一个跑方法");
    }

    public  String details(){
        return "这狗是"+breed+"品种\t"+"年龄"+age+"岁\t颜色"+color+"\t价格"+price+"元";
    }
}
