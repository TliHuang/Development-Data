package com.icss.day03;

import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入分数：");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();

            /*int score = Integer.parseInt(args[0]);*/
        /*if (score < 60) {
            System.out.println("成绩不合格，需要熬夜好好努力一把！");
        } else {
            System.out.println("成绩合格！");
        }*/
            //当if后面有{}时，if控制的是整个{}中的内容，
            //当if后面没有{}事，if控制的是离if最近的那一条语句

            if (score < 60) {
                System.out.println("不及格，继续加油！");
            } else if (score < 70) {
                System.out.println("及格，好险！");
            } else if (score < 80) {
                System.out.println("中等，值得变得更好！");
            } else if (score < 90) {
                System.out.println("良好，再突破一下！");
            } else {
                System.out.println("你真的很棒了，继续保持！");
            }
        }
    }
}
