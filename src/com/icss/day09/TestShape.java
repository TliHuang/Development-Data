package com.icss.day09;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();//本态
        Shape s = new Circle();//多态   向上转型——自动转换
        Circle c1 = (Circle) s;//向下转型——强制转换   本态还原
        s.draw();//虚方法调用：看着是调用了父方法，实际上是调用了子类的方法
//    编译的是父类型，执行的是子类型
    }
}
