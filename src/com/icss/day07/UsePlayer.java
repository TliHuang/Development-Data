package com.icss.day07;

public class UsePlayer {
    public static void main(String[] args) {

        Player a = new Player("天仙娃娃",1,100);
        Player b = new Player("神秘人",12,2100);
        Player c = new Player("龙珠",15,3400);
//        System.out.println(a.getName()+ "\t等级："+a.getGrade()+"\t能量："+a.getEnergy());
        System.out.println( new Player("天仙娃娃",1,100).toString());
        System.out.println("发言到："+Player.Comment("大家好啊,我来了"));
        System.out.println(b);
        System.out.println("发言到："+Player.Comment("我也来了"));
        System.out.println(c.getName()+ "\t等级："+c.getGrade()+"\t能量："+c.getEnergy());
        System.out.println("发言到："+Player.Comment("我来了"));
    }
}
