package com.icss.day07;

/**
 * 实体类用来创建对象（bean），对象是用来封装数据的
 * 实体类规范（Javabean）
 *  属性私有，提供公有的get/set方法
 */
public class Study {
    private int id;
    private String name;
    private double money;

    public Study(int id,String name){
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Study(int id,String name,double money){
        this.id = id;
        this.name = name;
        this.money = money;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
