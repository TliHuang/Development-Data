package com.icss.day02;

/**
 * 基本数据类型之布尔型和字符型
 */
public class Type2 {
    public static void main(String[] args) {
        /**
         *基本数据类型
         *      布尔型：1字符 = 8位（值只有两个true 真和false 假）
         *      字符型：2字节 = 16位（能与数值转化，需要用单引号引起来）
         */
        char c1 = 'a';
        System.out.println(c1);
        char c2 = 'A';
        int i = c2;
        System.out.println(i);

        char c3 = (char) 97;
        System.out.println(c3);
        System.out.println((int) '汤');
        System.out.println((char) 27748);
    }
}
