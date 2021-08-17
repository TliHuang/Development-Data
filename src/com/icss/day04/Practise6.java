package com.icss.day04;

public class Practise6 {
    public static void main(String[] args) {
        int a = 1;
        while (a < 5) {
            int b = 1;
            while (b < 5) {
                int c = 1;
                while (c < 5) {
                    if (a != b && a != c && b != c) {
                        int sum = a * 100 + b * 10 + c;
                        System.out.print(sum + "\t");
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
    }
}
