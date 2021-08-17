package com.icss.day04;

import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        /**
         * 水仙花数
         * 三位数
         * 百位的立方+十位的立方+个位的立方=数本身
         */
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");*/
        int num = 100;
        while (num <1000){
            int a = num / 100;
            int b = num / 10 % 10;
            int c = num % 10;
            if (num == a*a*a + b*b*b + c*c*c) {
                System.out.println(num + "为水仙花数");
            }
            num++;
        }
    }
}
