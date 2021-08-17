package com.icss.day04;

public class TestWhile2 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.print("i=" + i+"\t");
            int j = 90;
            while (j <= 100) {
                System.out.print("j=" + j+"\t");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
