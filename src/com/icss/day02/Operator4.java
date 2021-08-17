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
public class Operator4 {
    public static void main(String[] args) {
        boolean b1 = true & false;//& 按位与 可以操作布尔变量（同真为真）
        System.out.println(b1);

        int i = 10;
        boolean b2 = false & (i++ > 10) & true & (8 > 7);
        System.out.println(b2);
        System.out.println(i);

        //按位与同1为1，否则为0
        //按位或有1为1，否则为0
        int a = 5;//0101
        int b = 7;//0111
        int c = a & b;
        System.out.println(c);
        System.out.println(~a);//取反为11111010，再取反加1为10000110（最高位不变）

        System.out.println(8 << 1);
        /**
         *位移运算
         * <<:向左位移（乘以2的n次方）
         * >>:向左位移（除以2的n次方）
         */
    }
}
