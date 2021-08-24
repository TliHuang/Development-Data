package com.icss.day06;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Fei(i));
        }

    }

    public static int Fei(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return Fei(n - 1) + Fei(n - 2);
        }
    }
}
