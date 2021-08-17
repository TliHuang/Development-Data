package com.icss.day03;

public class TestSwitch {
    public static void main(String[] args) {
        Color c = Color.YELLOW;
        switch (c) {
            case RED:
                System.out.println("红灯");
                break;
            case GREEN:
                System.out.println("绿灯");
                break;
            case YELLOW:
                System.out.println("黄灯");
                break;
            default:
                System.out.println("啥也不是");
                break;
        }
    }
}
