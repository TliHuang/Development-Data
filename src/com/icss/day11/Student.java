package com.icss.day11;

public class Student extends Person {
    private int sid;

    public Student(){

    }

    public Student(int sid) {
        this.sid = sid;
    }

    public Student(String name, int sid) {
        super(name);
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String study(){
        return "学生学习";
    }
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                '}';
    }
}
