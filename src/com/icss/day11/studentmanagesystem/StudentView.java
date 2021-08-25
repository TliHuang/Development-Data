package com.icss.day11.studentmanagesystem;

import java.util.Scanner;

public class StudentView {
    StudentList sl = new StudentList(10);
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        StudentView sv = new StudentView();
        sv.enterMainMenu();

    }
    public void enterMainMenu () {

        boolean temp = true;

        do {
            System.out.print("---------------学生信息管理系统---------------\n\n");
            System.out.println("\t\t\t\t1 添加学生");
            System.out.println("\t\t\t\t2 修改学生");
            System.out.println("\t\t\t\t3 删除学生");
            System.out.println("\t\t\t\t4 学生列表");
            System.out.print("\t\t\t\t5 退    出\n\n");
            System.out.print("\t\t\t\t请选择（1-5）：");
//            new StudentView().enterMainMenu();
            char c = Utility.readMenuSelection();
            switch (c) {
                case '1':
                    addNewStudent();

                    break;
                case '2':
                    modifyStudent();

                    break;
                case '3':
                    deleteStudent();

                    break;
                case '4':
                    listAllStudents();

                    break;
                case '5':
                    System.out.print("确认是否退出（Y/N）：");
                    char confirm = Utility.readConfirmSelection();
                    if (confirm == 'Y') {
                        temp = false;
                    }
                    break;
            }
        } while (temp);
    }

    private void addNewStudent () {
        System.out.print("---------------添加学生信息---------------\n\n");
        System.out.print("\t\t\t\t姓名：");
        String name = Utility.readString(8);
        System.out.print("\t\t\t\t性别：");
        char gender = Utility.readChar();
        System.out.print("\t\t\t\t年龄：");
        int age = Utility.readInt(4);
        System.out.print("\t\t\t\t电话：");
        String phone = Utility.readString(12);
        System.out.print("\t\t\t\t邮箱：");
        String email = Utility.readString(18);
        Student s1 = new Student(name, gender, age, phone, email);
        Boolean isFlage = sl.addStudent(s1);
        if (isFlage) {
            System.out.println("-----------------添加完成-----------------");
        } else {
            System.out.println("-----------------添加失败-----------------");
        }
    }

    private void modifyStudent () {
        System.out.print("---------------修改学生信息---------------\n\n");
        System.out.print("请选择待修改的学生编号(-1退出)：");
        int nn = sc.nextInt()-1;
        if (nn == -2){//当dn为-1时，结束方法
            return;
        }
        if (nn > sl.getTotal()){
            System.out.println("学生不存在，无法修改");
        }
        System.out.println(sl.getStudent(nn));
        System.out.print("\t\t\t\t姓名("+sl.getStu()[nn].getName()+"):");
        String name1 = Utility.readString(8);
        System.out.print("\t\t\t\t性别("+sl.getStu()[nn].getGender()+"):");
        char gender1 = Utility.readChar();
        System.out.print("\t\t\t\t年龄("+sl.getStu()[nn].getAge()+"):");
        int age1 = Utility.readInt(4);
        System.out.print("\t\t\t\t电话("+sl.getStu()[nn].getPhone()+"):");
        String phone1 = Utility.readString(12);
        System.out.print("\t\t\t\t邮箱("+sl.getStu()[nn].getEmail()+"):");
        String email1 = Utility.readString(18);
        Student s2 = new Student(name1, gender1, age1, phone1, email1);
        Boolean isF = sl.replaceStudent(nn, s2);
        if (isF) {
            System.out.println("-----------------修改完成-----------------");
        } else {
            System.out.println("-----------------修改失败-----------------");
        }
    }

    private void deleteStudent () {
        System.out.print("---------------删除学生信息---------------\n\n");
        System.out.print("请选择待删除的学生编号(-1退出)：");
        int dn = Utility.readInt()-1;
        if (dn == -2){//当dn为-1时，结束方法
            return;
        }
        System.out.print("确认是否删除（Y/N）：");
        char confirm = Utility.readConfirmSelection();
        if (confirm == 'Y') {
            Boolean isFa = sl.deleteStudent(dn);
            if (isFa) {
                System.out.println("-----------------删除完成-----------------");
            } else {
                System.out.println("-----------------删除失败-----------------");
            }
        }

    }

    private void listAllStudents() {
        System.out.println("请选择查询方式 1 查询全部 2 按编号查询");
        int n = Utility.readInt();
        if (n == 1) {
            System.out.print("---------------学生信息列表---------------\n\n");
            sl.getAllStudents();
        } else if (n == 2) {
            System.out.println("请输入编号：");
            int num = Utility.readInt()-1;
            System.out.println(sl.getStudent(num));
        } else {
            System.out.println("输入错误");
        }
    }
}
