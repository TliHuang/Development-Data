package com.icss.day03;

import java.util.Scanner;

public class TextSwitch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年月日：");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
            switch (m) {
                case 1:
                    sum = d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 2:
                    sum = 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 3:
                    sum = 31 + 29 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 4:
                    sum = 31 + 29 + 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 5:
                    sum = 31 + 29 + 31 + 30 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 6:
                    sum = 31 + 29 + 31 + 30 + 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 7:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 8:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 9:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 10:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 11:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                case 12:
                    sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
                    System.out.println("该年为闰年，且过了有" + sum + "天！");
                    break;
                default:
                    System.out.println("输入错误！");
            }
        } else {
            switch (m) {
                case 1:
                    sum = d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 2:
                    sum = 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 3:
                    sum = 31 + 28 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 4:
                    sum = 31 + 28 + 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 5:
                    sum = 31 + 28 + 31 + 30 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 6:
                    sum = 31 + 28 + 31 + 30 + 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 7:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 8:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 9:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 10:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 11:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                case 12:
                    sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
                    System.out.println("该年为平年，且过了有" + sum + "天！");
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
       /* int temp = 0;

        switch (m) {
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                sum += 28;
            case 2:
                sum += 31;
            case 1:
                sum += d;

        }


        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            temp = 1;
        }


        if (temp == 1 && m > 2) {
            System.out.println("该年为闰年，且过了有" + ++sum + "天！");
        } else {
            System.out.println("该年为平年，且过了有" + sum + "天！");
        }*/
    }
}
