package com.icss.day07;

public class UseStudy {
    public static void main(String[] args) {
        Study stu = new Study(002,"乖乖",1000);
        Study st = new Study(001,"宝宝");
        System.out.println("学号："+st.getId()+"\n"+"姓名："+st.getName());
        System.out.println("学号："+stu.getId()+"\n"+"姓名："+stu.getName()+"\n"+"财产："+stu.getMoney());

    }
}
