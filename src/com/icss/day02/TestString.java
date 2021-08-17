package com.icss.day02;

public class TestString {
    public static void main(String[] args) {
        String str1 = "abc123";//String为引用类型，内容需要双引号包含
        str1 = str1 + 123;//任何数据类型的值与字符串的值拼接都返回字符串型，拼接符为+
        System.out.println(str1);
        System.out.println(5 + 6 + "abc" + 7 + 8);
        /*
            语句块以“{”开始，以“}”结束
         */
        {
            int a = 10;//局部变量的有效范围为离变量最近的语句块，一旦超出了语句块，变量销毁
        }
        //System.out.println(a);出错
    }
}
