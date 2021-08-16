package com.icss.day05;

import java.util.Scanner;

/**
 *求任意两个值的最大公约数
 *
 */
public class Practise2 {
    public static void main(String[] args) {
        /*long time1 = System.currentTimeMillis();
        int sum = 0;
        for (long i = 0;i < 100000;i++){
            sum +=i;
        }
        System.out.println(sum);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入任意两个数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a,b,c,temp;
        a = num1;
        b = num2;
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num1 % num2 != 0){
            c =num1 % num2;
            num1 = num2;
            num2 = c;
        }
        System.out.println(num2+"是最大公约数");
        c = a * b /num2;
        System.out.println(c+"是最小公倍数");
    }
}
