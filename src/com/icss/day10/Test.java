package com.icss.day10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] stu = {//对象数组
                new Student("老张", 20, 100),
                new Student("老齐", 19, 50),
                new Student("老李", 21, 80),
                new Student("老罗", 18, 70),
                new Student("小高", 84, 90)
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字1或2：");
        int n = sc.nextInt();
        for (Student s : new Test().sort(n, stu)) {
            System.out.println(s);
        }

    }

    public Student[] sort(int n, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            for (int j = i + 1; j < stu.length; j++) {
                double d1 = 0;
                double d2 = 0;
                switch (n) {
                    case 1:
                        d1 = stu[i].getAge();
                        d2 = stu[j].getAge();
                        break;
                    case 2:
                        d1 = stu[i].getScore();
                        d2 = stu[j].getScore();
                        break;
                    default:
                        System.out.println("输入错误，请重新输入");
                }
                if (d1 < d2) {
                    Student t = stu[i];
                    stu[i] = stu[j];
                    stu[j] = t;
                }
            }
        }
        return stu;
    }
}
