package com.icss.day05;

public class Practise4 {
    public static void main(String[] args) {
        star(5);
    }
    public static int star(int m){
        for (int i = 1;i<=m;i++){
            for (int k=m;k>i;k--){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = m-1;i>=1;i--){
            for (int k=m-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return 0;
    }
}
