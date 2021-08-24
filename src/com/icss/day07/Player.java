package com.icss.day07;

public class Player {
    private String name;
    private int grade;
    private int energy;

    public Player(String name, int grade, int energy) {
        this.name = name;
        this.grade = grade;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public static String Comment(String c) {
        return c;
    }

    @Override
    public String toString() {
        return name + ", 等级：" + grade + ", 能量" + energy;
    }
}
