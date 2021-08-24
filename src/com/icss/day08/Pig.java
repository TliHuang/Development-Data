package com.icss.day08;

public class Pig extends Animal{
    private String gender;

    public Pig(String color, String type, String gender) {//super在构造方法中需要放在非注释行的首行，调用父类方法
        super(color, type);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("这是睡的方法");
    }
    //在父类中有两个move方法，如果有重写则有限访问重写方法，被重写方法需要用super调用
    public String move(){
        return "懒得动";
    }

    @Override
    public String toString() {
        return "Pig{" +
                "color='" + super.getColor() + '\'' +
                ",type='" + super.getType() + '\'' +
                ",gender='" + gender + '\'' +
                '}';
    }

}
