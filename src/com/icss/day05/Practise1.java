package com.icss.day05;

import java.util.Scanner;

/**
 * 求1000以内的完数
 * 因子（不包含本身）和等于本身
 */
public class Practise1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i + "是完数");
            }
        }
    }
}
