package com.icss.day09;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i<=50;i++){

            if (i%7==0||i%10==7){
                count++;
                if (count>4){
                    break;
                }
                continue;
            }else {
                System.out.print(i+"\t");
            }
        }
    }
}
