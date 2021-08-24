package com.icss.day07;

public class A {
    public static void main(String[] args) {
        System.out.println(new B().toString());
    }
}
class B{
        byte b;
        short s;
        int i;
        long l;
        boolean boo;
        char c;
        String str;

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", boo=" + boo +
                ", c=" + c +
                ", str='" + str + '\'' +
                ", f=" + f +
                ", d=" + d +
                ", a=" + a +
                '}';
    }

    float f;
        double d;
        A a;
}