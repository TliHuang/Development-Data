package com.icss.day11;

public class Practise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        /*方式一 元素交换
        for (int i = 0,j = arr.length-1;i<j;i++,j--){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }*/
//        方法二 使用新数组
        int[] a = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            a[i] = arr[arr.length-1-i];
        }
        for (int i:a) {
            System.out.print(i+"\t");
        }
    }
}
