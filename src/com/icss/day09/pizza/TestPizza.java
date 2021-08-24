package com.icss.day09.pizza;

import java.util.Scanner;

public class TestPizza {
    public static void main(String[] args) {
        TestPizza testPizza = new TestPizza();
        Scanner scanner = new Scanner(System.in);
        boolean temp = true;
        do {
            System.out.println("请输入您要制作的披萨：1.培根披萨 2.海鲜披萨 3.退出");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("请输入培根克数");
                    double q = scanner.nextDouble();
                    System.out.println("请输入培根的大小");
                    int s = scanner.nextInt();
                    System.out.println("请输入培根的价格");
                    double p = scanner.nextDouble();
                    Bacon bacon = new Bacon("", p, s, q);
                    testPizza.details(bacon);
                    break;
                case 2:
                    System.out.println("请输入配料信息");
                    String m = scanner.next();
                    System.out.println("请输入培根的大小");
                    int si = scanner.nextInt();
                    System.out.println("请输入培根的价格");
                    double pi = scanner.nextDouble();
                    SeaFood seaFood = new SeaFood("", pi, si, m);
                    testPizza.details(seaFood);

                    break;
                case 3:
                    temp = false;
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
            }
        }while (temp);
    }
    public void details(Pizza pizza){
        if (pizza instanceof Bacon){
            System.out.println(((Bacon)pizza).show());

        }else if(pizza instanceof SeaFood){
            SeaFood seaFood = (SeaFood)pizza;
            System.out.println(seaFood.show());
        }else {
            System.out.println("输入错误");
        }
    }
}
