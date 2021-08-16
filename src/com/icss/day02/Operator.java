package com.icss.day02;

/**
 * 运算符
 * 算数运算符：+， -， * ，/ ，%（求模）， ++（在原值的基础上加1）， --（在原值的基础上减1）
 * 赋值运算符：= ，+= ，-= ，*=， /= ，%=
 * 比较（关系）运算符：< ，> ，>=， <=， == ，!=
 * 逻辑运算符：&& ，|| ，！
 * 位运算符：&， |， ~， ……
 * 三目运算符：（条件？值1：值2）
 * 其他运算符：【】，new，（）....
 */
public class Operator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        int num3 = num1 + num2;//num1 + num2是表达式（表达式需要有运算符参与）
        System.out.println(num3);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);//两个整数做除法运算得到整数部分

        /*System.out.println(5 / 0);
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at com.icss.day02.Operator.main(Operator.java:24)*/
        System.out.println(5.0 / 0);//Infinity(无限大）
        num2 = 28;
        System.out.println(num2 % num1);//求模（等价于余数）
        int num4 = 11;
        //System.out.println(num4++);//先执行操作后进行加1
        System.out.println(++num4);//先进行加1在执行操作

    }
}
