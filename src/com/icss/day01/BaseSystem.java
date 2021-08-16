package com.icss.day01;

/**
 * 进制演示（常用的进制为2进制，8进制，10进制，16进制）
 */
public class BaseSystem {
    public static void main(String[] args) {
        int arr = 0x123;//0x在Java中表示16进制
        System.out.println("十六进制中的123按十进制输出为" + arr);
        //Java中的变量不允许重复声明，但允许变量重新赋值
        //Java允许使用中文做标识符，强烈不推荐
        int arr1 = 0123;//0开头在Java中表示八进制
        System.out.println("八进制中的123按十进制输出为：" + arr1);
    }
}
