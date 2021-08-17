package com.icss.day05;

/**
 * 方法重载
 * 1.在同一个类中
 * 2.方法名相同
 * 3.参数列表必须不一致（参数列表包含参数个数，参数顺序，参数类型）
 * 4.返回值类型不影响重载
 * 注意：参数个数，参数顺序，参数类型都一样，是同一个方法
 */
public class TestMethod4 {
    public static void main(String[] args) {
       System.out.println(add("aa","b","cc"));
    }


    public static String add(String ... str) {//可变长参数，适用于类型固定，参数个数不固定，是jdk1.5之后的新特性
        String sum = "";
        for (int i = 0;i<str.length;i++){
            sum = sum + str[i];
        }
        return sum;
    }
}
