package com.icss.day08;

public class Test {
    public static void main(String[] args) {
        Pig p = new Pig("粉色","小香猪","母");
        System.out.println(p);
        p.sleep();
        p.Eat();
        p.Run();
        System.out.println(p.move());
    }
}
