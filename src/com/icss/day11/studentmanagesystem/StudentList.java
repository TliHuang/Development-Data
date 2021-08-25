package com.icss.day11.studentmanagesystem;

import java.util.Arrays;

public class StudentList {
    private int total = 0;
    private Student[] stu;
    String details = "编号\t姓名\t性别\t年龄\t电话\t邮箱";

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Student[] getStu() {
        return stu;
    }

    public void setStu(Student[] stu) {
        this.stu = stu;
    }

    //创建数组对象，将数组对象赋值给属性，为属性做初始化操作
    public StudentList(int totalStudent) {

        this.stu = new Student[totalStudent];
    }

    public StudentList() {

    }

    //添加学生信息
    public boolean addStudent(Student student) {
        if (total <= stu.length) {
            stu[total++] = student;
            return true;
        } else {
            System.out.println("数组已满，不能添加");
            return false;
        }

    }

    //修改学生信息
    public boolean replaceStudent(int index, Student cust) {
        if (index < 0 || index > total) {
            return false;
        } else {
            stu[index] = cust;
            return true;
        }
    }

    //删除学生信息
    public boolean deleteStudent(int index) {
        if (index < 0 || index > total) {
            return false;
        } else {
            for (int i = index + 1; i < total; i++) {
                stu[index] = stu[index + 1];
                index++;
            }
            stu[--total] = null;//将移动后的最后一个元素置空
            return true;
        }
    }

    //查询所有学生信息
    public Student[] getAllStudents() {
        System.out.println(details);
        for (int i = 0; i < total; i++) {
            String data = (i + 1) + "\t\t" + stu[i].getName() +
                    "\t\t" + stu[i].getGender() +
                    "\t\t" + stu[i].getAge() +
                    "\t\t" + stu[i].getPhone() +
                    "\t\t" + stu[i].getEmail() + "\n";
            System.out.println(data);
        }
        return this.stu;

    }

    public Student getStudent(int index) {
        if (index > 0 || index < total) {
            return stu[index];
        } else {
            return null;
        }
    }

   /* @Override
    public String toString() {
        System.out.println(details);
        for (int i = 0; i < total; i++) {
            details = (i + 1) + "\t\t" +
                    stu[i].getName() + "\t\t" +
                    stu[i].getGender() + "\t\t" +
                    stu[i].getAge() + "\t\t" +
                    stu[i].getPhone() + "\t\t" +
                    stu[i].getEmail() + "\n";
            System.out.println(details);
        }
        return details;
    }*/
}
