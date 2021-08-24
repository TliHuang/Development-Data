package com.icss.day10;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 48, 15, 87, 12, 34};
        int maxnum = 0;
        for (int i =0;i< arr.length;i++) {
            if (arr[i] > arr[maxnum]) {
                maxnum = i;
            }
        }
        System.out.println("该数组中最大值为：" + arr[maxnum]);
        System.out.println("该数组所对应的下标为"+maxnum);
    }
}
