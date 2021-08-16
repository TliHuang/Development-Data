package com.icss.day05;

public class TestMethod2 {
    public static void main(String[] args) {
        System.out.print("开始");
        a();
        System.out.print("结束");
    }

    public static void a() {
        System.out.print("aaa");
        b();
    }

    public static void b() {
        System.out.print("bbb");
    }
}
