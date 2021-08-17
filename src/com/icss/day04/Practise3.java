package com.icss.day04;

import java.util.Scanner;

public class Practise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        int f = 0;
        int i = 0;
        while (num > 0) {
            f = f * 10 + num % 10;
            num = num / 10;
            i++;
        }
        System.out.println("该整数是" + i + "位数,逆序为：" + f);
    }
}
