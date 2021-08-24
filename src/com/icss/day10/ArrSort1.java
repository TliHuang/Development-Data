package com.icss.day10;

import java.util.Scanner;

/**
 * 冒泡排序
 */
public class ArrSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {64, 48, 15, 87, 12, 34};

        int t;
        System.out.print("请输入数组元素个数：");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("请输入需要排序的一组数：");
        for (int k = 0; k < num; k++) {
            arr[k] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {//控制轮数
            for (int j = 0; j < arr.length-i; j++) {//控制比较次数
                if (arr[j] > arr[j+1]) {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.print("排完序的数为：");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
