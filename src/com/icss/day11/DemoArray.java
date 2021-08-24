package com.icss.day11;

/**
 * 多态数组
 */
public class DemoArray {

    public static void main(String[] args) {
        Person p1 = new Student("刘能",1);//多态（向上转型）
        Person p2 = new Cook("曹操",2);//多态（向上转型）
        Person p3 = new Student("广坤",3);//多态（向上转型）
        Person p4 = new Cook("刘备",4);//多态（向上转型）
        Person[] p = {p1,p2,p3,p4,new Student("赵四",5)};
        /*提供一个方法，参数类型为person数组，在方法内部判断数组元素是学生还是厨师
        * 当判断是学生时，输出学生学习，当判断是厨师，输出厨师炒菜*/
        new DemoArray().details(p);
    }
    public void details(Person[] pp){
        String s = new Student().study();
        String c = new Cook().cook();
        for (Person per : pp){
            if (per instanceof Student){
                System.out.println(((Student)per).getName()+s);
            }else if (per instanceof Cook){
                System.out.println(((Cook)per).getName()+c);
            }
        }
    }

}
