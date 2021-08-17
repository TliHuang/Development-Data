package com.icss.day03;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入3位整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("排序后为：" + a + "," + b + "," + c);
    }
}
