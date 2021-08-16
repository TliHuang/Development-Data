package com.icss.day04;

import java.util.Scanner;

public class Practise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1~100的偶数和位：" + sum);
    }
}
