package com.icss.day02;

/**
 * 复习
 * java发展史
 * 版本划分
 * Java特点
 * 跨平台原理
 * 注释
 * 标识符命名规则
 * 编码格式要求
 * <p>
 * 变量的声明与赋值
 * 数据类型 变量名 = 值
 */

/**
 * 数据类型
 * 基本数据类型
 * 整型：
 * byte(1字节 = 8位)、取值范围是-128~127
 * short(2字节 = 16位)、取值范围是-2的15次方到2的15次方-1
 * int(4字节 = 32位)、取值范围是-2的31次方到2的31次方-1
 * long(8字节 = 64位)取值范围是-2的63次方到2的63次方-1
 * 浮点型：
 * float(4字节 = 32位)、取值范围-2^128~2^128,浮点型底层存储方式与整型相同
 * double(8字节 = 64位)、取值范围-2^1024~2^1024
 * 字符型：char
 * 布尔型：boolean
 * 引用数据类型
 * 除了基本数据类型之外都是引用数据类型
 */
public class Type {
    public static void main(String[] args) {
        byte i = -128;
        short j = 1288;
        int k = i + j;//i + j表达式
        //在赋值时可以将小类型的值或变量赋给大类型的变量,反之不可以
        //自动转型：小类型的值或变量与大类型或变量做算数运算，结果会变为大类型（byte与short做算数运算得到的结果为int）
        int m = 100;
        int n = m + i;
        long l = 463151561l;
        System.out.println(l + "\n" + n);//当数值超过int类型的取值范围时，long类型的数值后面需要加l或L
        //byte与short做运算得到的结果为int型
        System.out.println(i + "\n" + j + "\n" + k);
        System.out.println("--------------------------------");
        float f = 5.0f;//当小数赋值给float类型的变量时，需要在数值后面加f或F
        System.out.println(f);
        double d = 2.8;
        System.out.println(d);
        //自动转型：byte -- > short -- > int -- > long -- > float -- > double
        byte b1 = 10;
        int i1 = 20;
        b1 = (byte) i1;
        System.out.println(b1);//强制类型转换 语法：（数据类型）变量（当数值超出类型范围可能会造成数据缺失）

    }
}
