package com.icss.day02;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//从控制台读取整数
        //System.out.println(num1);
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();//从控制台读取整数
        //System.out.println(num2);
        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();//从控制台读取整数
        //System.out.println(num3);
        int max = (((num1 > num2) ? num1 : num2) > num3) ? ((num1 > num2) ? num1 : num2) : num3;
        System.out.println("你输入的三个数中，最大值为：" + max);
    }
}
