package com.icss.day04;

import java.util.Scanner;

public class Practise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean temp = true;
        Double num = 10000.0;
        do {
            System.out.println("*********ICBC*********");
            System.out.println("\t\t1-存钱");
            System.out.println("\t\t2-取钱");
            System.out.println("\t\t3-查询");
            System.out.println("\t\t4-退出");
            System.out.println("**********************");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("请输入存入金额：");
                    double num1 = sc.nextDouble();
                    num += num1;
                    System.out.println("存钱成功，当前余额为：" + num);
                    break;
                case 2:
                    System.out.print("请输入所取金额：");
                    double num2 = sc.nextDouble();

                    if (num2 > num) {
                        System.out.println("当前余额不足，余额为：" + num);
                    } else {
                        num -= num2;
                        System.out.println("取钱成功，当前余额为：" + num);
                    }
                    break;
                case 3:
                    System.out.println("余额为：" + num);
                    break;
                case 4:
                    System.out.println("退出系统成功");
                    temp = false;
                    break;
            }
        } while (temp);
    }
}
