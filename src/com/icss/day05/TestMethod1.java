package com.icss.day05;

import java.util.Scanner;

public class TestMethod1 {
    public static void main(String[] args) {
        eat();//在主方法中调用方法
        int money = work(8);//返回值就是一个数据，可以是变量接收，参数为实参
        System.out.println(money);
    }

    //定义eat方法
    public static void eat() {
        System.out.println("吃早餐");
        System.out.println("吃午饭");
        System.out.println("吃晚餐");
    }

    //定义一个带返回值的 方法
    public static int work(int hour) {//形参，有效范围为方法内部
        int money = hour*300;
        System.out.println("敲代码");
        return money;
    }
}
