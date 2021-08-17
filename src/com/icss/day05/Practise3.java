package com.icss.day05;

/**
 * 求100以内的素数
 */
public class Practise3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean temp = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    temp = false;
                    break;
                }
            }
            if (temp)
                System.out.print(i + "\t");
        }

    }
}
