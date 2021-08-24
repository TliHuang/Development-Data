package com.icss.day07;

public class Use {
    public static void main(String[] args) {
        /*Dog dog = new Dog();//实例化狗对象
        dog.breed = "斗牛犬";
        dog.age = 4;
        dog.color = "棕色";
        dog.price = 1000;
        System.out.println(dog.details());//实例方法是属于对象的，调用方式：对象名.方法（）;
      new Person().study();
      new Person().play(3);*/

        Person p = new Person();
        p.name = "王乖乖";
        p.setAge(4);
        p.id = "001";
        p.weight = 30;
        p.height = 144;
        System.out.println(p.toString());
        System.out.println(p.getAge());
    }
}
