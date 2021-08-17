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
public class Operator3 {
    public static void main(String[] args) {
        System.out.println(true && false);//&&（逻辑与,是短路） 同真为真
        int i = 10;
        boolean b1 = (i > 10) && (i++ > 10);
        System.out.println(b1);
        System.out.println(i);
        System.out.println("---------------------");
        System.out.println(true || false);//||（逻辑或，是短路） 有真为真
        int j = 99;
        b1 = false || (j++ > 10) || true || (8 > 7);
        System.out.println(b1);
        System.out.println(j);
        System.out.println(!(5 > 2));//逻辑非，取反（）是为了提高优先级
        System.out.println('A' == 65);
    }
}
