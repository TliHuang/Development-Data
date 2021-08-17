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
public class Operator2 {
    public static void main(String[] args) {
        int num = 10;
        double score = 44;

        System.out.println(score += 100);
        System.out.println(score -= 100);
        System.out.println(score *= 100);
        score = score / num;
        System.out.println(score);

        System.out.println(score %= 2);
    }
}
