package com.icss.day09;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        new TestAnimal().details(dog);
    }
    public void details(Animal animal){
        if (animal instanceof Cat){
            Animal animal1 = new Cat();
            animal.eat();
            ((Cat) animal).work();
            System.out.println("这是一只猫");
        } else if (animal instanceof Dog){
            Animal animal2 = new Dog();
            animal2.eat();
            ((Dog) animal2).work();
            System.out.println("这是一只狗");
        }else {
            System.out.println("啥也不是");
        }
    }
}
