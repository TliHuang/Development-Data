package com.icss.day04;

public class Practise4 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");*/
        int num = 2000;
        int n = 0;
        while (num <= 3000) {
            if (num % 400 == 0 || num % 4 == 0 && num % 100 != 0) {
                System.out.print(num + "\t");
                n++;
                if (n%10==0){
                    System.out.print("\n");
                }
            }
            num++;
        }
    }
}
