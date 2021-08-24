package com.icss.day10;

import java.util.Scanner;

/**
 * 快速排序
 */
public class ArrSort {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.print("排完序的数为：");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
