package com.icss.day09;
/*多态：
    首先要有继承关系
    其次，子类要有父类的重写方法
    最后在测试的时候new 子类对象赋值给父类引用
注：在调用中是通过父类的方法引用子类
父类是多态
子类是本态*/
public class Shape {
   public void draw() {}
}

class Circle extends Shape {
   public void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
   public void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
   public void draw() {
        System.out.println("Triangle.draw()");
    }
}
