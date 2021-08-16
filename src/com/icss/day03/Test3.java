package com.icss.day03;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a值：");
        int a = sc.nextInt();
        System.out.println("请输入b值：");
        int b = sc.nextInt();
        if (a % b == 0 && a + b > 100) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
