package com.icss.day04;

import java.util.Scanner;

public class Practise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count1 = 0;
        double count2 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("请输入第" + i + "位的年龄：");
            int n = sc.nextInt();
            if (n > 30) {
                count1++;
            } else {
                count2++;
            }
        }
        double p1 = count1 / 10 * 100;
        double p2 = 100 - p1;
        System.out.println("年龄超过30岁的概率为" + p1 + "%");
        System.out.println("年龄不超过30岁的概率为" + p2 + "%");
    }
}
