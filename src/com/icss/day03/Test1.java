package com.icss.day03;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 28;
        int t;
        System.out.println("a的值为：" + a);
        System.out.println("b的值为：" + b);
        t = a;
        a = b;
        b = t;
        System.out.println("转换后a的值为：" + a);
        System.out.println("转换后b的值为：" + b);
    }
}
