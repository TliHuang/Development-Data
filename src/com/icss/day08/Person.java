package com.icss.day08;

public class Person {
    private String name;
    private String id;
    private int age;
    private char gender;

    public Person(){
        this("","");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("aaaaaaaaaa");
    }

    public Person(String name, String id) {
        System.out.println("aaaaaaaaaa");
        System.out.println("bbbbbbbbbb");
        this.name = name;
        this.id = id;
    }

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Person(String name, String id, int age, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
       new Person();
    }
}
