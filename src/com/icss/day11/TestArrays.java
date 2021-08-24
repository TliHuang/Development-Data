package com.icss.day11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5,8,6,7,9};

        Arrays.sort(arr);//排序

        for (int i : arr){
            System.out.print(i);
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
    }
}
