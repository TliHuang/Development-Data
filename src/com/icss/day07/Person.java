package com.icss.day07;

/**
 * 创建一个人类Person
 * 属性：身高，体重，年龄，姓名，身份证
 * 方法：学习（求1-100之间的素数），玩（打印菱形）
 */
public class Person {
    String name;//姓名
    String id;//身份证号
    int weight;//体重
    int height;//身高
    private int age;//年龄  成员变量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {//局部变量
        if (age > 120 && age < 0) {
            System.out.println("输入错误！");
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public void study() {//学习方法
        for (int i = 2; i <= 100; i++) {
            boolean temp = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    temp = false;
                    break;
                }
            }
            if (temp)
                System.out.print(i + "\t");
        }
        System.out.print("\n");
    }

    public int play(int m) {//打印菱形的玩方法
        for (int i = 1; i <= m; i++) {
            for (int k = m; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = m - 1; i >= 1; i--) {
            for (int k = m - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return 0;
    }
}
