package com.icss.day05;

/**
 * 方法重载
 * 1.在同一个类中
 * 2.方法名相同
 * 3.参数列表必须不一致（参数列表包含参数个数，参数顺序，参数类型）
 * 4.返回值类型不影响重载
 * 注意：参数个数，参数顺序，参数类型都一样，是同一个方法
 */
public class TestMethod3 {
    public static void main(String[] args) {
        System.out.print("开始");

        System.out.print("结束");
    }

    public static double add(double a,double b) {
        return a+b;
    }

    public static int add(int a,int b) {
        return a-b;
    }
}
