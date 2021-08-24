package com.icss.day08;

public class Animal {
    private String color;
    private String type;

   /* public  Animal(){

    }*/

    public Animal(String color, String type) {
        super();
        this.color = color;
        this.type = type;
    }

    public void Eat(){
        System.out.println("这是吃的方法");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void Run(){
        System.out.println("这是跑的方法");
    }
    public String move(){
        return "都能动";
    }
}
