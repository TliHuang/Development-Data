package com.icss.day10;

public class ValueTransfer {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for (int i:arr){
            System.out.print(i+"-");
        }
        new ValueTransfer().changeArray(arr);
        System.out.println();
        for (int i:arr){
            System.out.print(i+"*");
        }
    }
    public void changeArray(int[] arr){
        arr[4] = 9;
        System.out.println();
        for (int i:arr){
            System.out.print(i+"￥");
        }
    }
}
