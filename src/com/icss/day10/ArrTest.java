package com.icss.day10;

import java.util.Scanner;

/**
 * 创建char类型数组，数组长度26，分别存放‘A’-‘Z’
 */
public class ArrTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char[] arr = new char[36];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) (i + 'A');
            } else {
                arr[i] = (char) (i - 26 + '0');
            }
            if (c==arr[i]){
                System.out.println(c);
                break;
            }else if (i == arr.length-1){
                System.out.println("该字符不存在");
            }
//            System.out.print(arr[i]+"\t");
        }


    }
}
