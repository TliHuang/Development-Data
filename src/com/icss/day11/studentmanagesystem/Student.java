package com.icss.day11.studentmanagesystem;

public class Student {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public Student() {

    }

    public Student(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\t姓名\t性别\t年龄\t电话\t邮箱\n" +
                "\t" + name +
                "\t\t" + gender +
                "\t\t" + age +
                "\t\t" + phone +
                "\t\t" + email;
    }
}
