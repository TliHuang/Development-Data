package com.icss.day11;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] a = new int[4];
        /*数组复制方式一*/
        /*for (int i = 0;i <a.length;i++){
            a[i] = arr[i];
        }

        */

        /*数组复制方式二*/
        System.arraycopy(arr,2,a,0,4);
        /*src:元素组
        srcPos:元素组的开始位置
        dest:目标数组
        destPos:目标数组的起始位置
        length:要复制的长度*/
        for (int i:a) {
            System.out.print(i+"\t");
        }
    }
}
