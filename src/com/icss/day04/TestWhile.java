package com.icss.day04;

/**
 * while循环
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {//值为true则执行，若一直为true则为死循环
            System.out.println("执行了" + i + "次");
            i++;
        }
        //循环需要变量初始化,循环条件判断,循环变量迭代,循环体
    }
}
