package com.icss.day03;

import java.util.Scanner;

public class TextSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch (a) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            case "d":
                System.out.println("D");
                break;
            default:
                System.out.println("输入错误！");

        }
    }
}
