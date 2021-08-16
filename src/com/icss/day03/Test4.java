package com.icss.day03;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = 0;
        long c = a;
        for (int i = 1; a > 0; i++) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        if (b == c) {
            System.out.println("该数为回文数！");
        } else {
            System.out.println("该数不是回文数！");
        }
    }
}
